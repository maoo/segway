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
  [:#banner1 :img] (html/set-attr :src "images/segway/trevenque2.JPG")

  [:#banner2 :div :h2] (html/content "Parque Peri Urbano de la Alhambra")
  [:#banner2 :div :p] (html/content "Recorrido tranquilo para disfrutar del segway, con vistas sobre la Alhambra, del valle del rio Darro, Sacromonte y Sierra Nevada, en un entorno natural de pinos y olivar, saliéndonos de los circuitos habituales destacando los valores paisajísticos de Granada.")
  [:#banner2 :p.readmore] (html/html-content "<a href="#">Leér mas &raquo;</a>")
  [:#banner2 :img] (html/set-attr :src "images/segway/albaicin446.JPG")

  [:#banner3 :div :h2] (html/content "Paquetes Vacationales")
  [:#banner3 :div :p] (html/content "Con estos paquetes vacacionales ofertamos rutas desde 2 días hasta rutas de 6 días, para los amantes de la naturaleza resaltando los elementos abióticos, bióticos y tradicionales que sorprenderán a nuestros visitantes ya que Granada es mucho más que su capital y costa.")
  [:#banner3 :p.readmore] (html/html-content "<a href="#">Leér mas &raquo;</a>")
  [:#banner3 :img] (html/set-attr :src "images/segway/perdiz9.JPG")

  [:#box1 :h2] (html/html-content "<img src=\"images/segway/segway-thumb.jpg\"/> ¿ Qué es un Segway ?")
  [:#box1 :p] (html/html-content "El <a href=\"http://es.wikipedia.org/wiki/Segway\">Segway<a/> es un vehículo de transporte ligero giroscópico eléctrico de dos ruedas, con auto balanceo controlado por ordenador. El ordenador y los motores situados en la base mantienen la base del Segway horizontal todo el tiempo. El usuario se debe inclinar hacia la dirección que quiera tomar (delante, detrás, derecha o izquierda).")
  [:#box1 :p.readmore] (html/html-content "<a href="#">Leér mas &raquo;</a>")

  [:#box2 :h2] (html/html-content "<img src=\"images/segway/helmet.jpg\"/> Seguridad es lo primero")
  [:#box2 :p] (html/html-content "Somos el unico <a target=\"_blank\" href=\"http://www.segway.es\">Centro Segway certificado</a> en Granada por la circulacion en la carretera; ponemos la seguridad de nuestos clientes antes de todo, desarrolando un curso para aprender a conducir el segway de forma sencilla y segura")
  [:#box2 :p.readmore] (html/substitute "")

  [:#box3 :h2] (html/html-content "<img src=\"images/segway/circuitos-thumb.jpg\"/> Circuitos")
  [:#box3 :p] (html/content "Los circuitos segway los utilizamos en Fiestas Patronales, Fiestas Deportivas, Semanas Culturales, Institutos, etc. para que disfruten todos los participantes de una sensación única sobre un vehículo novedoso, no contaminante y divertido. Perfecto como incentivo de empresas, para publicitar la apertura de un comercio o local con una actividad novedosa y llamativa.")
  [:#box3 :p.readmore] (html/html-content "<a href="#">Leér mas &raquo;</a>"))