(ns segway.pages.home
  (:use segway.pages.common)
  (:require [net.cgrand.enlive-html :as html]))

(html/deftemplate index "template/my-index.html"
  [ctxt]

  [:title] (html/content "Segway Granada Ventur")

  ;;Structure - using snippets in segway.pages.common
  ;;@TODO Here we're not using map in the right way, we should just apply the snippet function
  [:#header]   (html/content (map #(header-snippet %) [0]))
  [:#footer]   (html/content (map #(footer-snippet %) [0]))
  [:.fl_left]   (html/content (map #(copyright-snippet %) [0]))

  ;; Home Contents
  [:#banner1 :div :h2] (html/content "Miradores del Albaycin")
  [:#banner1 :div :p] (html/content "Descubriremos el Albaicín y el Sacromonte a través de sus miradores (San Cristóbal, Sacromonte, Carvajales, Lona, Huerto del Carlos, San Nicolás), calles y callejones, iglesias y rincones abalconados.")
  [:#banner1 :p.readmore] (html/html-content "<a href=\"route-1.html\">Leér mas &raquo;</a>")
  [:#banner1 :img] (html/set-attr :src "images/segway/routes/albaycin/albaycin-02.jpg")

  [:#banner2 :div :h2] (html/content "Parque Peri Urbano de la Alhambra")
  [:#banner2 :div :p] (html/content "Recorrido tranquilo para disfrutar del segway, con vistas sobre la Alhambra, del valle del rio Darro, Sacromonte y Sierra Nevada, en un entorno natural de pinos y olivar, saliéndonos de los circuitos habituales destacando los valores paisajísticos de Granada.")
  [:#banner2 :p.readmore] (html/html-content "<a href=\"route-2.html\">Leér mas &raquo;</a>")
  [:#banner2 :img] (html/set-attr :src "images/segway/routes/periurbano/periurbano-01.jpg")

  [:#banner3 :div :h2] (html/content "Comarca del Marquesado")
  [:#banner3 :div :p] (html/content "Esta ruta la vamos a realizar en la cara Norte  del Parque Nacional de Sierra Nevada en cuyas faldas se sitúa el acogedor pueblo de la Calahorra,  capital de la Comarca del Marquesado del Zenete, con su majestuoso castillo medieval dominando el altiplano granadino.")
  [:#banner3 :p.readmore] (html/html-content "<a href=\"route-4.html\">Leér mas &raquo;</a>")
  [:#banner3 :img] (html/set-attr :src "images/segway/routes/marquesado/marquesado-02.jpg")

  [:#box1 :h2] (html/html-content "<img width=\"60\" height=\"60\" src=\"images/segway/whatis-square-01.jpg\"/> ¿ Qué es un Segway ?")
  [:#box1 :p] (html/html-content "El <a href=\"http://es.wikipedia.org/wiki/Segway\">Segway<a/> es un vehículo de transporte ligero giroscópico eléctrico de dos ruedas, con auto balanceo controlado por ordenador. El ordenador y los motores situados en la base mantienen la base del Segway horizontal todo el tiempo. El usuario se debe inclinar hacia la dirección que quiera tomar (delante, detrás, derecha o izquierda).")
  [:#box1 :p.readmore] (html/html-content "<a href=\"whatis.html\">Leér mas &raquo;</a>")

  [:#box2 :h2] (html/html-content "<img width=\"60\" height=\"60\" src=\"images/segway/helmet.jpg\"/> Seguridad es lo primero")
  [:#box2 :p] (html/html-content "Somos el unico <a target=\"_blank\" href=\"http://www.segway.es\">Centro Segway certificado</a> en Granada por la circulacion en la carretera; ponemos la seguridad de nuestos clientes antes de todo, desarrolando un curso para aprender a conducir el segway de forma sencilla y segura")
  [:#box2 :p.readmore] (html/substitute "")

  [:#box3 :h2] (html/html-content "<img width=\"60\" height=\"60\" src=\"images/segway/tracks/tracks-square-01.jpg\"/> Circuitos")
  [:#box3 :p] (html/content "Los circuitos segway los utilizamos en Fiestas Patronales, Fiestas Deportivas, Semanas Culturales, Institutos, etc. para que disfruten todos los participantes de una sensación única sobre un vehículo novedoso, no contaminante y divertido. Perfecto como incentivo de empresas, para publicitar la apertura de un comercio o local con una actividad novedosa y llamativa.")
  [:#box3 :p.readmore] (html/html-content "<a href=\"tracks.html\">Leér mas &raquo;</a>"))