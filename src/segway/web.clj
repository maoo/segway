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

(defn redirectToTemplates
  [url]
  (let [webdata-item (get webdata url)]
      (render-to-response
        (if (= url "/index.html") (index webdata-item) (detail webdata-item)))))

(def routes
  (app
    [""] (fn [req]
          (let [url (req :uri)] (redirectToTemplates "/index.html")))
    [*] (fn [req]
          (let [url (req :uri)] (redirectToTemplates url)))))