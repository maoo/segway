(ns segway.run
  (:use segway.web
        ring.util.response
        ring.adapter.jetty
        [ring.middleware.reload :only [wrap-reload]]
        [ring.middleware.file :only [wrap-file]]
        [ring.middleware.file-info :only [wrap-file-info]]
        [ring.middleware.stacktrace :only [wrap-stacktrace]]))

(def jetty-port (or (System/getenv "PORT") "8080"))
(def environment (or (System/getenv "SEGWAY_ENV") "dev"))

(defn run-server* [app & {:keys [port] :or {port (Integer/parseInt jetty-port)}}]
  (let [nses [(-> (:ns (meta app))
                str
                symbol)]]
    (println (str "Running Segway Server on " environment " environment"))
    (if (= environment "dev")
      (run-jetty
        (-> app
          (wrap-file *webdir*)
          (wrap-file-info)
          (wrap-reload (conj nses 'segway.data 'segway.web 'segway.pages.common 'segway.pages.home 'segway.pages.detail))
          (wrap-stacktrace))
        {:port port :join? false})
      (run-jetty
        (-> app
          (wrap-file *webdir*)
          (wrap-stacktrace))
        {:port port :join? false}))))

(defmacro run-server [app]
  `(run-server* (var ~app)))

(defonce *server* (run-server routes))