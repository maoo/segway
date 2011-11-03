(ns demo.web
  (:use ring.adapter.jetty))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world"})

(defn -main []
  (let [jettyPort (System/getenv "PORT")]
    (let [port (if jettyPort jettyPort "8080")]
      (run-jetty app {:port (Integer/parseInt port)}))))