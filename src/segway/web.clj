(ns segway.web
  (:use segway.data
        segway.pages.home
        segway.pages.detail
        ring.util.response
        [net.cgrand.moustache :only [app]]
        [clojure.contrib.duck-streams :only [pwd]])
  (:require [net.cgrand.enlive-html :as html]))

(def *webdir* (str (pwd) "/src/template/"))

(defn render [t]
  (apply str t))

(def render-to-response
     (comp response render))

(def routes
  (app
    [*] (fn [req]
          (let [url (req :uri)
               webdata-item (get webdata url)]
                (render-to-response
                          (if (= url "/index.html") (index webdata-item) (detail webdata-item)))))
   [&]        {:status 404
               :body "Page Not Found"}))