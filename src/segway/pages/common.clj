(ns segway.pages.common
  (:require [net.cgrand.enlive-html :as html]))

(def *logo-sel* {[:#logo :> :h1][:#logo :> :p]})
(html/defsnippet logo-snippet "template/my-index.html" *logo-sel*
  [cntx]
  [:p] (html/content "Senderismo sobre ruedas en Granada y sus Parques Naturales")
  [:h1] (html/content "SEGWAY GRANADA VENTUR"))

(def *menu-sel* [:#topnav :> :ul])
(html/defsnippet menu-snippet "template/my-style-demo.html" *menu-sel*
  [cntx]
  [:ul] (html/html-content
       "<li class=\"active\"><a href=\"home.html\">Home</a></li>
        <li><a href=\"#\">Rutas</a>
          <ul>
            <li><a href=\"route-1.html\">Miradores del Albaicin-Sacromonte</a></li>
            <li><a href=\"route-2.html\">Parque Peri Urbano de la Alhambra</a></li>
            <li><a href=\"route-3.html\">Sierra de la Alfaguara</a></li>
            <li><a href=\"route-4.html\">Comarca del Marquesado</a></li>
            <li><a href=\"route-5.html\">Dólmenes de Gorafe (Desierto granadino)</a></li>
            <li><a href=\"route-6.html\">Trevenque</a></li>
            <li><a href=\"route-7.html\">Arco Noreste de la Vega de Granada</a></li>
            <li><a href=\"route-8.html\">Dehesa del Camarate</a></li>
            <li><a href=\"route-9.html\">Fuente de la Teja</a></li>
            <li><a href=\"route-10.html\">Ciudad de Guadix</a></li>
            <li><a href=\"route-11.html\">Dílar</a></li>
            <li><a href=\"route-12.html\">Tranvía de la Sierra</a></li>
          </ul>
        </li>
        <li><a href=\"tracks.html\">Circuitos</a></li>
        <li><a href=\"#\">Mas</a>
          <ul>
            <li><a href=\"about.html\">Quienes Somos</a></li>
            <li><a href=\"whatis.html\">Que es un Segway</a></li>
            <li><a href=\"holidays.html\">Paquetes Vacationales</a></li>
            <li><a href=\"faq.html\">Preguntas Frecuentes</a></li>
          </ul>
        </li>"))

(def *header-sel* [:#header])
(html/defsnippet header-snippet "template/my-index.html" *header-sel*
  [cntx]
  [:#logo] (html/set-attr :style "width:500px;")
  [:#logo] (html/content (map #(logo-snippet %) [0]))
  [:#topnav] (html/content (map #(menu-snippet %) [0])))

(def *footer-sel* [:#footer])
(html/defsnippet footer-snippet "template/my-style-demo.html" *footer-sel*
  [cntx]
  [:.box1 :h2] (html/content "¿ Quienes somos ?")
  [:.box1 :img] (html/set-attr :src "images/segway/miguel-thumb.jpg")
  [:.box1 :p] (html/substitute "")
  [:.box1] (html/append "Miguel Algarra nacido 1962 en el Albaycín, amante de la naturaleza, tras diferentes etapas relacionadas con el medio natural, el turismo activo y varios años de formación crea una empresa con un grupo de personas jóvenes que apuestan por un ecoturismo sobre ruedas,respetuoso con el medio ambiente en un entorno poco conocido, intimo y con encanto natural.")
  [:.contactdetails :h2] (html/content "Contactar")
  [:.contactdetails :ul :li] (html/substitute "")
  [:.contactdetails :ul] (html/html-content "
          <li>Segway Granada Ventur</li>
          <li>c/ Victoria Eugenia, 40</li>
          <li>18170 Alfacar</li>
          <li>Granada - España</li>
          <li>+34 958549101</li>
          <li>+34 627390785</li>
          <li><a href=\"mailto:info@segwaygranadaventur.com\">info@segwaygranadaventur.com</a></li>")

  [:.flickrbox :h2] (html/content "Nuestras Fotos"))

(def *copyright-sel* [:.fl_left])
(html/defsnippet copyright-snippet "template/my-style-demo.html" *copyright-sel*
  [cntx]
  [:.fl_left] (html/html-content "Copyright &copy; 2011 - Todos los derechos reservados - <a href=\"http://www.segwaygranadaventur.com\">www.segwaygranadaventur.com</a>"))
