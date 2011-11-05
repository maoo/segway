(ns segway.web
  (:use segway.pages.home
        segway.pages.route
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
   ["home.html"] (fn [req]
               (render-to-response
                         (index {:message "We changed the message!"})))
   ["route-1.html"] (fn [req]
               (render-to-response
                         (route {:title "Ruta del Albaycin"
                                 :sections [{:text "Descubriremos el  Albaicín  y el Sacromonte  a través de sus miradores (San Cristóbal, Sacromonte, Carvajales, Lona, Huerto del Carlos, San Nicolás), calles y callejones, iglesias y rincones abalconados."
                                             :image "images/segway/albaicin380.JPG"}
                                            {:text "Un recorrido intimo para el disfrute de los sentidos con espectaculares vistas de la Alhambra desde sus diferentes ángulos, ideal para los amantes de la fotografía y un conocimiento más profundo del Barrio acompañados de un guía nacido allí."
                                             :image "images/segway/albaicin459.JPG"}
                                            {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1h 30m</b></li><li>Tipo de terreno:<b>empedrado</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Mirador de San Nicolás</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>45€ por persona</li></ul>"
                                             :image "images/segway/albaicin455.JPG"}]})))
   [&]        {:status 404
               :body "Page Not Found"}))