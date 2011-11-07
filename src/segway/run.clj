(ns segway.run
  (:use segway.web
        ring.util.response
        ring.adapter.jetty
        [ring.middleware.reload :only [wrap-reload]]
        [ring.middleware.file :only [wrap-file]]
        [ring.middleware.stacktrace :only [wrap-stacktrace]]))

(def jetty-port (or (System/getenv "PORT") "8080"))

(defn run-server* [app & {:keys [port] :or {port (Integer/parseInt jetty-port)}}]
  (let [nses [(-> (:ns (meta app))
                str
                symbol)]]
    (println "run-server*" nses)
    (run-jetty
      (-> app
        (wrap-file *webdir*)
        (wrap-reload (conj nses 'segway.data 'segway.web 'segway.pages.common 'segway.pages.home 'segway.pages.detail))
        (wrap-stacktrace))
      {:port port :join? false})))

(defmacro run-server [app]
  `(run-server* (var ~app)))

(defonce *server* (run-server routes))