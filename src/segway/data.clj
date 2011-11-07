(ns segway.data
  (:use segway.pages.home
        segway.pages.detail))

(def webdata
  {"/albaycin.html" {:title "Miradores del Albaicin-Sacromonte"
                     :route detail
                     :url "albaycin.html"
                     :paragraphs [
                                   "Descubriremos el  Albaicín  y el Sacromonte  a través de sus miradores (San Cristóbal, Sacromonte, Carvajales, Lona, Huerto del Carlos, San Nicolás), calles y callejones, iglesias y rincones abalconados."
                                   "Un recorrido intimo para el disfrute de los sentidos con espectaculares vistas de la Alhambra desde sus diferentes ángulos, ideal para los amantes de la fotografía y un conocimiento más profundo del Barrio acompañados de un guía nacido allí."
                                   "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1h 30m</b></li><li>Tipo de terreno:<b>empedrado</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Mirador de San Nicolás</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>45€ por persona</li></ul>"]
                     :images [["images/segway/routes/albaycin/albaycin-01.jpg" "images/segway/routes/albaycin/albaycin-square-01.jpg"]
                              ["images/segway/routes/albaycin/albaycin-02.jpg" "images/segway/routes/albaycin/albaycin-square-02.jpg"]
                              ["images/segway/routes/albaycin/albaycin-03.jpg" "images/segway/routes/albaycin/albaycin-square-03.jpg"]
                              ["images/segway/routes/albaycin/albaycin-04.jpg" "images/segway/routes/albaycin/albaycin-square-04.jpg"]
                              ["images/segway/routes/albaycin/albaycin-05.jpg" "images/segway/routes/albaycin/albaycin-square-05.jpg"]
                              ["images/segway/routes/albaycin/albaycin-06.jpg" "images/segway/routes/albaycin/albaycin-square-06.jpg"]
                              ["images/segway/routes/albaycin/albaycin-07.jpg" "images/segway/routes/albaycin/albaycin-square-07.jpg"]
                              ["images/segway/routes/albaycin/albaycin-08.jpg" "images/segway/routes/albaycin/albaycin-square-08.jpg"]
                              ["images/segway/routes/albaycin/albaycin-09.jpg" "images/segway/routes/albaycin/albaycin-square-09.jpg"]
                              ["images/segway/routes/albaycin/albaycin-10.jpg" "images/segway/routes/albaycin/albaycin-square-10.jpg"]
                              ["images/segway/routes/albaycin/albaycin-11.jpg" "images/segway/routes/albaycin/albaycin-square-11.jpg"]
                              ["images/segway/routes/albaycin/albaycin-12.jpg" "images/segway/routes/albaycin/albaycin-square-12.jpg"]
                              ["images/segway/routes/albaycin/albaycin-13.jpg" "images/segway/routes/albaycin/albaycin-square-13.jpg"]
                              ["images/segway/routes/albaycin/albaycin-14.jpg" "images/segway/routes/albaycin/albaycin-square-14.jpg"]
                              ["images/segway/routes/albaycin/albaycin-15.jpg" "images/segway/routes/albaycin/albaycin-square-15.jpg"]
                              ["images/segway/routes/albaycin/albaycin-16.jpg" "images/segway/routes/albaycin/albaycin-square-16.jpg"]]}
   "/periurbano.html" {:title "Parque Peri Urbano de la Alhambra"
                       :route detail
                       :url "periurbano.html"
                       :paragraphs [
                                     "Recorrido tranquilo para disfrutar del segway, con vistas sobre la Alhambra, del valle del rio Darro, Sacromonte y Sierra Nevada, en un entorno natural de pinos y olivar, saliéndonos de los circuitos habituales destacando  los valores paisajísticos de Granada."
                                     "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1h 30m</b></li><li>Tipo de terreno:<b>tierra</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Parking del Generalife.</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>45€ por persona</li></ul>"]
                       :images [["images/segway/routes/periurbano/periurbano-01.jpg" "images/segway/routes/periurbano/periurbano-square-01.jpg"]
                                ["images/segway/routes/periurbano/periurbano-02.jpg" "images/segway/routes/periurbano/periurbano-square-02.jpg"]
                                ["images/segway/routes/periurbano/periurbano-03.jpg" "images/segway/routes/periurbano/periurbano-square-03.jpg"]
                                ["images/segway/routes/periurbano/periurbano-04.jpg" "images/segway/routes/periurbano/periurbano-square-04.jpg"]
                                ["images/segway/routes/periurbano/periurbano-05.jpg" "images/segway/routes/periurbano/periurbano-square-05.jpg"]
                                ["images/segway/routes/periurbano/periurbano-06.jpg" "images/segway/routes/periurbano/periurbano-square-06.jpg"]
                                ["images/segway/routes/periurbano/periurbano-07.jpg" "images/segway/routes/periurbano/periurbano-square-07.jpg"]
                                ["images/segway/routes/periurbano/periurbano-08.jpg" "images/segway/routes/periurbano/periurbano-square-08.jpg"]
                                ["images/segway/routes/periurbano/periurbano-09.jpg" "images/segway/routes/periurbano/periurbano-square-09.jpg"]
                                ["images/segway/routes/periurbano/periurbano-10.jpg" "images/segway/routes/periurbano/periurbano-square-10.jpg"]
                                ["images/segway/routes/periurbano/periurbano-11.jpg" "images/segway/routes/periurbano/periurbano-square-11.jpg"]
                                ["images/segway/routes/periurbano/periurbano-12.jpg" "images/segway/routes/periurbano/periurbano-square-12.jpg"]]}
   "/alfaguara.html" {:title "Sierra de la Alfaguara"
                      :route detail
                      :url "alfaguara.html"
                      :paragraphs [
                                    "Al Noroeste  de la capital a unos 20 Km., configura un importante conjunto de geomorfología cárstica que mantiene formaciones de quejigar-encinar, pinares autóctonos y repoblación y numerosos endemismos catalogados en peligro de extinción."
                                    "Una ruta para los amantes de la Naturaleza y el senderismo que hará disfrutar al más exigente con  panorámicas vistas de Sierra Nevada en un entorno natural único."
                                    "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>4h a 5h</b></li><li>Tipo de terreno:<b>caminos tierra</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Centro de visitantes Puerto Lobo.</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"]
                      :images [["images/segway/routes/alfaguara/alfaguara-01.jpg" "images/segway/routes/alfaguara/alfaguara-square-01.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-02.jpg" "images/segway/routes/alfaguara/alfaguara-square-02.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-03.jpg" "images/segway/routes/alfaguara/alfaguara-square-03.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-04.jpg" "images/segway/routes/alfaguara/alfaguara-square-04.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-05.jpg" "images/segway/routes/alfaguara/alfaguara-square-05.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-06.jpg" "images/segway/routes/alfaguara/alfaguara-square-06.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-07.jpg" "images/segway/routes/alfaguara/alfaguara-square-07.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-08.jpg" "images/segway/routes/alfaguara/alfaguara-square-08.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-09.jpg" "images/segway/routes/alfaguara/alfaguara-square-09.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-10.jpg" "images/segway/routes/alfaguara/alfaguara-square-10.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-11.jpg" "images/segway/routes/alfaguara/alfaguara-square-11.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-12.jpg" "images/segway/routes/alfaguara/alfaguara-square-12.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-13.jpg" "images/segway/routes/alfaguara/alfaguara-square-13.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-14.jpg" "images/segway/routes/alfaguara/alfaguara-square-14.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-15.jpg" "images/segway/routes/alfaguara/alfaguara-square-15.jpg"]
                               ["images/segway/routes/alfaguara/alfaguara-16.jpg" "images/segway/routes/alfaguara/alfaguara-square-16.jpg"]]}

   "/marquesado.html" {:title "Comarca del Marquesado"
                       :route detail
                       :url "marquesado.html"
                       :paragraphs [
                                     "Esta ruta la vamos a realizar en la cara Norte  del Parque Nacional de Sierra Nevada en cuyas faldas se sitúa el acogedor pueblo de la Calahorra,  capital de la Comarca del Marquesado del Zenete, con su majestuoso castillo medieval dominando el altiplano granadino."
                                     "Visitaremos Aldeire, pequeño pueblo de estructura árabe, sus castaños centenarios, sus vegas y huertas regadas por las aguas de la rambla de Benejar a través de su intrincada red de acequias que conservan todavía su estructura árabe."
                                     "Ruta donde destacan 3 tipos de paisaje, la llanura y sobre ella las escombreras de las minas, el bosque de rivera  junto a las huertas y castaños centenarios y las vistas sobre las cumbres de Sierra Nevada y sus pinares."
                                     "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"]
                       :images [["images/segway/routes/marquesado/marquesado-01.jpg" "images/segway/routes/marquesado/marquesado-square-01.jpg"]
                                ["images/segway/routes/marquesado/marquesado-02.jpg" "images/segway/routes/marquesado/marquesado-square-02.jpg"]
                                ["images/segway/routes/marquesado/marquesado-03.jpg" "images/segway/routes/marquesado/marquesado-square-03.jpg"]
                                ["images/segway/routes/marquesado/marquesado-04.jpg" "images/segway/routes/marquesado/marquesado-square-04.jpg"]
                                ["images/segway/routes/marquesado/marquesado-05.jpg" "images/segway/routes/marquesado/marquesado-square-05.jpg"]
                                ["images/segway/routes/marquesado/marquesado-06.jpg" "images/segway/routes/marquesado/marquesado-square-06.jpg"]
                                ["images/segway/routes/marquesado/marquesado-07.jpg" "images/segway/routes/marquesado/marquesado-square-07.jpg"]
                                ["images/segway/routes/marquesado/marquesado-08.jpg" "images/segway/routes/marquesado/marquesado-square-08.jpg"]
                                ["images/segway/routes/marquesado/marquesado-09.jpg" "images/segway/routes/marquesado/marquesado-square-09.jpg"]
                                ["images/segway/routes/marquesado/marquesado-10.jpg" "images/segway/routes/marquesado/marquesado-square-10.jpg"]
                                ["images/segway/routes/marquesado/marquesado-11.jpg" "images/segway/routes/marquesado/marquesado-square-11.jpg"]
                                ["images/segway/routes/marquesado/marquesado-12.jpg" "images/segway/routes/marquesado/marquesado-square-12.jpg"]
                                ["images/segway/routes/marquesado/marquesado-13.jpg" "images/segway/routes/marquesado/marquesado-square-13.jpg"]
                                ["images/segway/routes/marquesado/marquesado-14.jpg" "images/segway/routes/marquesado/marquesado-square-14.jpg"]
                                ["images/segway/routes/marquesado/marquesado-15.jpg" "images/segway/routes/marquesado/marquesado-square-15.jpg"]
                                ["images/segway/routes/marquesado/marquesado-16.jpg" "images/segway/routes/marquesado/marquesado-square-16.jpg"]]}
   "/gorafe.html" {:title "Dólmenes de Gorafe (Desierto granadino)"
                   :route detail
                   :url "gorafe.html"
                   :paragraphs [
                                 "Al Norte de Granada en el Altiplano Granadino y en la depresión Guadix-Baza se encuentra Gorafe a 92 Km. de la capital. Un paisaje que nos sorprenderá a cada momento sobre una tierra colorada semidesértica."
                                 "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li><li>Tipo de terreno:<b>pistas y ramblas</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>95€ (medio día, ruta segway)</li></ul>"]
                   :images [["images/segway/routes/gorafe/gorafe-01.jpg" "images/segway/routes/gorafe/gorafe-square-01.jpg"]
                            ["images/segway/routes/gorafe/gorafe-02.jpg" "images/segway/routes/gorafe/gorafe-square-02.jpg"]
                            ["images/segway/routes/gorafe/gorafe-03.jpg" "images/segway/routes/gorafe/gorafe-square-03.jpg"]
                            ["images/segway/routes/gorafe/gorafe-04.jpg" "images/segway/routes/gorafe/gorafe-square-04.jpg"]
                            ["images/segway/routes/gorafe/gorafe-05.jpg" "images/segway/routes/gorafe/gorafe-square-05.jpg"]
                            ["images/segway/routes/gorafe/gorafe-06.jpg" "images/segway/routes/gorafe/gorafe-square-06.jpg"]
                            ["images/segway/routes/gorafe/gorafe-07.jpg" "images/segway/routes/gorafe/gorafe-square-07.jpg"]
                            ["images/segway/routes/gorafe/gorafe-08.jpg" "images/segway/routes/gorafe/gorafe-square-08.jpg"]
                            ["images/segway/routes/gorafe/gorafe-09.jpg" "images/segway/routes/gorafe/gorafe-square-09.jpg"]
                            ["images/segway/routes/gorafe/gorafe-10.jpg" "images/segway/routes/gorafe/gorafe-square-10.jpg"]
                            ["images/segway/routes/gorafe/gorafe-11.jpg" "images/segway/routes/gorafe/gorafe-square-11.jpg"]
                            ["images/segway/routes/gorafe/gorafe-12.jpg" "images/segway/routes/gorafe/gorafe-square-12.jpg"]
                            ["images/segway/routes/gorafe/gorafe-13.jpg" "images/segway/routes/gorafe/gorafe-square-13.jpg"]
                            ["images/segway/routes/gorafe/gorafe-14.jpg" "images/segway/routes/gorafe/gorafe-square-14.jpg"]
                            ["images/segway/routes/gorafe/gorafe-15.jpg" "images/segway/routes/gorafe/gorafe-square-15.jpg"]
                            ["images/segway/routes/gorafe/gorafe-16.jpg" "images/segway/routes/gorafe/gorafe-square-16.jpg"]
                            ["images/segway/routes/gorafe/gorafe-17.jpg" "images/segway/routes/gorafe/gorafe-square-17.jpg"]]}
   "/trevenque.html" {:title "Trevenque"
                      :route detail
                      :url "trevenque.html"
                      :paragraphs [
                                    "Recorrido donde nos adentraremos en el Parque Nacional de Sierra Nevada circulando por pistas de tierra hasta llegar al cortijo de la Cortijuela  donde visitaremos su jardín botánico."
                                    "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li><li>Tipo de terreno:<b>caminos y veredas</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ (medio día, ruta segway mas visita a jardín botánico)</li></ul>"]
                      :images [["images/segway/routes/trevenque/trevenque-01.jpg" "images/segway/routes/trevenque/trevenque-square-01.jpg"]
                               ["images/segway/routes/trevenque/trevenque-02.jpg" "images/segway/routes/trevenque/trevenque-square-02.jpg"]
                               ["images/segway/routes/trevenque/trevenque-03.jpg" "images/segway/routes/trevenque/trevenque-square-03.jpg"]
                               ["images/segway/routes/trevenque/trevenque-04.jpg" "images/segway/routes/trevenque/trevenque-square-04.jpg"]
                               ["images/segway/routes/trevenque/trevenque-05.jpg" "images/segway/routes/trevenque/trevenque-square-05.jpg"]
                               ["images/segway/routes/trevenque/trevenque-06.jpg" "images/segway/routes/trevenque/trevenque-square-06.jpg"]
                               ["images/segway/routes/trevenque/trevenque-07.jpg" "images/segway/routes/trevenque/trevenque-square-07.jpg"]
                               ["images/segway/routes/trevenque/trevenque-08.jpg" "images/segway/routes/trevenque/trevenque-square-08.jpg"]
                               ["images/segway/routes/trevenque/trevenque-09.jpg" "images/segway/routes/trevenque/trevenque-square-09.jpg"]
                               ["images/segway/routes/trevenque/trevenque-10.jpg" "images/segway/routes/trevenque/trevenque-square-10.jpg"]
                               ["images/segway/routes/trevenque/trevenque-11.jpg" "images/segway/routes/trevenque/trevenque-square-11.jpg"]
                               ["images/segway/routes/trevenque/trevenque-12.jpg" "images/segway/routes/trevenque/trevenque-square-12.jpg"]
                               ["images/segway/routes/trevenque/trevenque-13.jpg" "images/segway/routes/trevenque/trevenque-square-13.jpg"]]}
   "/vega-granada.html" {:title "Arco Noreste de la Vega de Granada"
                         :route detail
                         :url "vega-granada.html"
                         :paragraphs [
                                       "El Arco Noroeste de la Vega de Granada está formado por 12  pueblos (  Alfacar- Beas de Granada- Calicasas- Cogollos Vega- Dudar- Guejar Sierra- Guevejar-Huetor Santillán- Nivar- Pinos Genil- Quentar- Viznar )  enclavados en dos espacios protegidos el Parque Natural de Sierra de Huetor y el Parque Nacional de Sierra Nevada y a escasos kilómetros de Granada."
                                       "Son pueblos pequeños de calles estrechas, encaladas conservando todavía ese aire de pueblo,  su identidad sin dar la espalda a la modernidad y con un nexo de unión –el agua- en sus numerosos nacimientos y acequias."
                                       "Las rutas que realizamos en estos pueblos son de una hora de duración para que los visitantes  recorran y conozcan sus rincones de una manera diferente y como herramienta para los propietarios de casas rurales y hoteles ofrezcan un producto diferente que contribuya al desarrollo sostenible de su comarca."
                                       "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>hora y media aproximada</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recorridos en el parque Sierra de Huetor</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"]}
   "/camarate.html" {:title "Dehesa del Camarate"
                     :route detail
                     :url "camarate.html"
                     :paragraphs [
                                   "La dehesa del Camarate se encuentra situada en la cara Norte del Parque Nacional de Sierra Nevada en Lugros ,en  esta se encuentra el único bosque sub-mediterráneo de toda la sierra formado por arces, hayas, robles, quejigos, cerezos silvestres, encinas en su parte baja y un esplendido bosque de rivera a lo largo del río Alhama."
                                   "Este paraje único para la flora se ha conservado gracias a la ganadería de reses bravas que pasta en esta dehesa. Subiremos al Cerro del Carnero a 1730 m, mirador sobre la dehesa y cumbres de la sierra. La mejor época para visitarla es en otoño cuando el bosque toma todas las tonalidades rojas de los arces y quejigos."
                                   "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>Medio dia</b></li><li>Tipo de terreno:<b>tierra mixta segway-senderismo</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>75€ por persona</li></ul>"]
                     :images [["images/segway/routes/camarate/camarate-01.jpg" "images/segway/routes/camarate/camarate-square-01.jpg"]
                              ["images/segway/routes/camarate/camarate-02.jpg" "images/segway/routes/camarate/camarate-square-02.jpg"]
                              ["images/segway/routes/camarate/camarate-03.jpg" "images/segway/routes/camarate/camarate-square-03.jpg"]
                              ["images/segway/routes/camarate/camarate-04.jpg" "images/segway/routes/camarate/camarate-square-04.jpg"]
                              ["images/segway/routes/camarate/camarate-05.jpg" "images/segway/routes/camarate/camarate-square-05.jpg"]
                              ["images/segway/routes/camarate/camarate-06.jpg" "images/segway/routes/camarate/camarate-square-06.jpg"]
                              ["images/segway/routes/camarate/camarate-07.jpg" "images/segway/routes/camarate/camarate-square-07.jpg"]
                              ["images/segway/routes/camarate/camarate-08.jpg" "images/segway/routes/camarate/camarate-square-08.jpg"]
                              ["images/segway/routes/camarate/camarate-09.jpg" "images/segway/routes/camarate/camarate-square-09.jpg"]
                              ["images/segway/routes/camarate/camarate-10.jpg" "images/segway/routes/camarate/camarate-square-10.jpg"]
                              ["images/segway/routes/camarate/camarate-11.jpg" "images/segway/routes/camarate/camarate-square-11.jpg"]
                              ["images/segway/routes/camarate/camarate-12.jpg" "images/segway/routes/camarate/camarate-square-12.jpg"]
                              ["images/segway/routes/camarate/camarate-13.jpg" "images/segway/routes/camarate/camarate-square-13.jpg"]
                              ["images/segway/routes/camarate/camarate-14.jpg" "images/segway/routes/camarate/camarate-square-14.jpg"]
                              ["images/segway/routes/camarate/camarate-15.jpg" "images/segway/routes/camarate/camarate-square-15.jpg"]
                              ["images/segway/routes/camarate/camarate-16.jpg" "images/segway/routes/camarate/camarate-square-16.jpg"]
                              ["images/segway/routes/camarate/camarate-17.jpg" "images/segway/routes/camarate/camarate-square-17.jpg"]
                              ["images/segway/routes/camarate/camarate-18.jpg" "images/segway/routes/camarate/camarate-square-18.jpg"]
                              ["images/segway/routes/camarate/camarate-19.jpg" "images/segway/routes/camarate/camarate-square-19.jpg"]]}
   "/fuente-teja.html" {:title "Fuente de la Teja"
                        :route detail
                        :url "fuente-teja.html"
                        :paragraphs [
                                      "Güejar Sierra, es un pueblo blanco de calles estrechas y empinadas que conserva todavía el encanto natural cuya principal característica es el agua, destacando su fuente de los 16 caños. Enclavado en el Parque Nacional de Sierra Nevada junto al cauce del rio Genil y el embalse de Canales,  es  balcón privilegiado con fabulosas vistas sobre los picos más altos de la sierra, la Alcazaba y el Mulhacen en un paisaje de castaños, tilos, nogales, encinas, almeses, que impresiona al visitante. Además encontraremos una gastronomía rica en matices y aromas de montaña."
                                      "Nuestras ruta las realizaremos en un paraje idílico, “Fuente la Teja” lugar que nos da una gran variedad de recorridos con una tranquilidad absoluta y un paisaje salido de los mejores pintores. Observaremos, castaños, encinas, pinos, vegetación de media montaña y en su parte más baja almendros y olivos, terminando en la casa rural del mismo nombre donde podremos degustar la gastronomía típica de la zona. También realizamos salidas desde el camping las Lomas hasta el pueblo o a  Fuente la Teja."
                                      "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>De 30 minutos a 2 horas</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Casa Rural Fuente la Teja</li><li>Camping Las Lomas</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ segun recorrido</li></ul>"]
                        :images [["images/segway/routes/fuente-teja/fuente-teja-01.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-01.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-02.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-02.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-03.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-03.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-04.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-04.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-05.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-05.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-06.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-06.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-07.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-07.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-08.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-08.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-09.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-09.jpg"]
                                 ["images/segway/routes/fuente-teja/fuente-teja-10.jpg" "images/segway/routes/fuente-teja/fuente-teja-square-10.jpg"]]}
   "/guadix.html" {:title "Ciudad de Guadix"
                   :route detail
                   :url "guadix.html"
                   :paragraphs [
                                 "Esta ruta la vamos a realizar en la Ciudad de Guadix (su significado árabe-Rio de la Vida), situada al noroeste de la capital granadina a unos 60 kilómetros y en la cara Norte de Sierra Nevada, asentada sobre una hoya en la que se alternan los ríos, tierras áridas, planicies de cereal y formaciones arcillosas fuertemente erosionadas."
                                 "Su casco histórico podemos decir que se acerca mas a la tipología castellana que andaluza, destacando las portadas renacentistas o su Catedral una mezcla gótica, renacentista y barroca construida sobre la antigua mezquita es uno de los conjuntos arquitectónicos más atrevidos del barroco."
                                 "Recorreremos los estrechos callejones de la judería, el barrio de Santa Ana que conserva todavía su trazado morisco y pasaremos por las casas señoriales de los siglos XVIII y XIX sin olvidar las tradicionales casas cueva que le han dado fama mundial."
                                 "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>De 1 hora y media a 2 horas</b></li><li>Tipo de terreno:<b>Asfalto</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"]
                   :images [["images/segway/routes/guadix/guadix-01.jpg" "images/segway/routes/guadix/guadix-square-01.jpg"]
                            ["images/segway/routes/guadix/guadix-02.jpg" "images/segway/routes/guadix/guadix-square-02.jpg"]
                            ["images/segway/routes/guadix/guadix-03.jpg" "images/segway/routes/guadix/guadix-square-03.jpg"]
                            ["images/segway/routes/guadix/guadix-04.jpg" "images/segway/routes/guadix/guadix-square-04.jpg"]
                            ["images/segway/routes/guadix/guadix-05.jpg" "images/segway/routes/guadix/guadix-square-05.jpg"]
                            ["images/segway/routes/guadix/guadix-06.jpg" "images/segway/routes/guadix/guadix-square-06.jpg"]
                            ["images/segway/routes/guadix/guadix-07.jpg" "images/segway/routes/guadix/guadix-square-07.jpg"]
                            ["images/segway/routes/guadix/guadix-08.jpg" "images/segway/routes/guadix/guadix-square-08.jpg"]
                            ["images/segway/routes/guadix/guadix-09.jpg" "images/segway/routes/guadix/guadix-square-09.jpg"]
                            ["images/segway/routes/guadix/guadix-10.jpg" "images/segway/routes/guadix/guadix-square-10.jpg"]
                            ["images/segway/routes/guadix/guadix-11.jpg" "images/segway/routes/guadix/guadix-square-11.jpg"]
                            ["images/segway/routes/guadix/guadix-12.jpg" "images/segway/routes/guadix/guadix-square-12.jpg"]
                            ["images/segway/routes/guadix/guadix-13.jpg" "images/segway/routes/guadix/guadix-square-13.jpg"]
                            ["images/segway/routes/guadix/guadix-14.jpg" "images/segway/routes/guadix/guadix-square-14.jpg"]
                            ["images/segway/routes/guadix/guadix-15.jpg" "images/segway/routes/guadix/guadix-square-15.jpg"]
                            ["images/segway/routes/guadix/guadix-16.jpg" "images/segway/routes/guadix/guadix-square-16.jpg"]
                            ["images/segway/routes/guadix/guadix-17.jpg" "images/segway/routes/guadix/guadix-square-17.jpg"]
                            ["images/segway/routes/guadix/guadix-18.jpg" "images/segway/routes/guadix/guadix-square-18.jpg"]
                            ["images/segway/routes/guadix/guadix-19.jpg" "images/segway/routes/guadix/guadix-square-19.jpg"]
                            ["images/segway/routes/guadix/guadix-20.jpg" "images/segway/routes/guadix/guadix-square-20.jpg"]
                            ["images/segway/routes/guadix/guadix-21.jpg" "images/segway/routes/guadix/guadix-square-21.jpg"]]}
   "/dilar.html" {:title "Dílar"
                  :route detail
                  :url "dilar.html"
                  :paragraphs [
                                "Esta ruta la realizamos en el pueblo de Dilar, frontera entre la vega y la sierra,   mirador privilegiado entre olivares y almendros en la salida del río del mismo nombre de la Sierra a la Vega."
                                "A unos 18 kilómetros de Granada, entre calles estrechas, blancas, con rincones de agua. Una ruta tranquila por tierra junto a  pinares, olivos y almendros, disfrutando de las vistas de la Sierra –Boca de la Pesca – Trevenque – Pico del Caballo -, llanos de Gojar y la Vega."
                                "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>De 1 a 2 horas según ruta</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Junto al hotel Zerlúnetta</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"]
                  :images [["images/segway/routes/dilar/dilar-01.jpg" "images/segway/routes/dilar/dilar-square-01.jpg"]
                           ["images/segway/routes/dilar/dilar-02.jpg" "images/segway/routes/dilar/dilar-square-02.jpg"]
                           ["images/segway/routes/dilar/dilar-03.jpg" "images/segway/routes/dilar/dilar-square-03.jpg"]
                           ["images/segway/routes/dilar/dilar-04.jpg" "images/segway/routes/dilar/dilar-square-04.jpg"]
                           ["images/segway/routes/dilar/dilar-05.jpg" "images/segway/routes/dilar/dilar-square-05.jpg"]
                           ["images/segway/routes/dilar/dilar-06.jpg" "images/segway/routes/dilar/dilar-square-06.jpg"]
                           ["images/segway/routes/dilar/dilar-07.jpg" "images/segway/routes/dilar/dilar-square-07.jpg"]
                           ["images/segway/routes/dilar/dilar-08.jpg" "images/segway/routes/dilar/dilar-square-08.jpg"]
                           ["images/segway/routes/dilar/dilar-09.jpg" "images/segway/routes/dilar/dilar-square-09.jpg"]
                           ["images/segway/routes/dilar/dilar-10.jpg" "images/segway/routes/dilar/dilar-square-10.jpg"]]}
   "/tranvia-sierra.html" {:title "Tranvía de la Sierra"
                           :route detail
                           :url "tranvia-sierra.html"
                           :paragraphs [
                                         "Güejar Sierra, es un pueblo blanco de calles estrechas y empinadas que conserva todavía el encanto natural cuya principal característica es el agua, destacando su fuente de los 16 caños. Enclavado en el Parque Nacional de Sierra Nevada junto al cauce del rio Genil y el embalse de Canales,  es  balcón privilegiado con fabulosas vistas sobre los picos más altos de la sierra, la Alcazaba y el Mulhacen en un paisaje de castaños, tilos, nogales, encinas, almeses, que impresiona al visitante. Además encontraremos una gastronomía rica en matices y aromas de montaña."
                                         "Esta ruta la vamos a realizar por el recorrido que hacia el antiguo tranvía de Granada al Charcón, desde la estación de Güejar Sierra hasta el Barranco de San Juan. Un recorrido junto al rio Genil sin grandes pendientes, circulando por puentes y túneles con unas vistas sobre el castañar, acompañados en todo momento por el murmullo del agua del rio."
                                         "Observando las construcciones típicas de montaña, las estaciones del tranvía , una vegetación de rivera, llevando a nuestra derecha la mítica Vereda de la Estrella que conduce a los amantes de la montaña al corazón de Sierra Nevada y al nacimiento del Genil .A la vuelta en la estación del Maitena tomaremos altura para tener unas vista sobre el pantano y el pueblo de Güejar el cual recorreremos sus callejas blancas, amacetadas y estrechas para bajar por el camino de la estación a nuestro punto de partida."
                                         "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1 a 2.30 h según recorrido</b></li><li>Tipo de terreno:<b>tierra y asfalto</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Puente de la fábrica de luz junto a la cola del pantano</li><li>Estación de Maitena</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60 euros por persona y según recorrido</li><li>75 euros con recogida en Granada y comida.</li></ul>"]
                           :images [["images/segway/routes/tranvia-sierra/tranvia-sierra-01.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-01.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-02.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-02.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-03.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-03.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-04.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-04.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-05.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-05.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-06.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-06.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-07.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-07.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-08.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-08.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-09.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-09.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-10.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-10.jpg"]
                                    ["images/segway/routes/tranvia-sierra/tranvia-sierra-11.jpg" "images/segway/routes/tranvia-sierra/tranvia-sierra-square-11.jpg"]]}
   "/tracks.html" {:title "Circuitos"
                   :route detail
                   :url "tracks.html"
                   :paragraphs [
                                 "Los circuitos segway los utilizamos en Fiestas Patronales, Fiestas Deportivas, Semanas Culturales, Institutos, etc. para que disfruten todos los participantes de una sensación única sobre un vehículo novedoso, no contaminante y divertido. Para que los vecinos y las personas que visitan el municipio lo recorran de una manera diferente, como incentivo de empresas, para publicitar la apertura de un comercio o local con una actividad novedosa y llamativa."
                                 "Programar una actividad diferente, que pueda sorprender y que además valla dirigida al público adulto, ya ha dejado de ser un problema. Con la experiencia adquirida, hemos podido constatar que la actividad que proponemos con nuestros innovadores segway x2 tiene el éxito garantizado."
                                 "La actividad consistirá en ofrecer a todos los asistentes a los actos organizados, la posibilidad de montar en un segway. Las necesidades técnicas son mínimas ya que solo necesitamos un espacio llano y libre de obstáculos."
                                 "En este espacio formamos a los participantes en grupos de 4, siempre de uno en uno y de manera controlada por un monitor, una vez formados saldremos del recinto para hacer un pequeño recorrido por el entorno acompañados siempre del monitor."
                                 "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li></ul><b>PRECIOS</b><ul><li>400 euros</li><li>75 euros con recogida en Granada y comida.</li></ul><b>INCLUYDO</b><ul><li>4 segway para realizar el circuito</li><li>Segway del monitor</li><li>Monitores-guía</li><li>Cascos</li><li>Material de señalización</li><li>Seguros obligatorios</li><li>3 horas de duración del circuito</li></ul>"]

                   :images [["images/segway/tracks/tracks-01.jpg" "images/segway/tracks/tracks-square-01.jpg"]
                            ["images/segway/tracks/tracks-02.jpg" "images/segway/tracks/tracks-square-02.jpg"]
                            ["images/segway/tracks/tracks-03.jpg" "images/segway/tracks/tracks-square-03.jpg"]]}
   "/about.html" {:title "Quienes Somos"
                  :route detail
                  :url "about.html"
                  :paragraphs [
                                "Miguel Algarra nacido 1962 en el Albaycín, amante de la naturaleza,  tras diferentes etapas relacionadas con  el medio natural,  el turismo activo y  varios años de formación crea una empresa con un grupo de personas jóvenes que apuestan  por un ecoturismo  sobre  ruedas,   respetuoso con el medio ambiente en un entorno  poco conocido, intimo y con  encanto natural. Basada en dar a conocer nuestros parques  naturales,  Sierra Nevada ,Sierra de  Huetor, comarca Guadix…., y  pueblos, con rutas alternativas, alojamientos singulares y gastronomía típica.  Pensando en un desarrollo sostenible de nuestra tierra  y como principio, el disfrute de nuestros clientes y su satisfacción, queriendo ofrecer  el mayor grado de calidad, trabajando con grupos reducidos de 4 personas  para los segway."
                                "Ofrecemos la posibilidad de disfrutar de este entorno a personas que bien por sus  condicionantes físicos o de falta de tiempo no    podrían disfrutar del mismo, una forma diferente de hacer turismo. El ocio y el disfrute paisajístico y cultural desde este entorno natural, nos ofrece una visión muy particular de un  Albaycinero  mostrando  nuestra ciudad más allá de las obligadas visitas turísticas de la capital y la provincia que no debemos perdernos; GRANADA ES MUCHO MÁS"
                                "Estamos situados en el parque natural de Sierra de Huetor en el pueblo de Alfacar, a 7 Km de Granada capital, pero aunque nuestra central esté aquí situada, nuestra empresa ofrece al visitante el servicio de desplazamiento desde su alojamiento hasta la zona en la que vamos a realizar la actividad."
                                "Pero nuestra actividad no se limita solo a las rutas en segway, también ofrecemos al cliente la posibilidad de elaborar paquetes de actividades  de uno o varios días, alternando las rutas en segway  con rutas de senderismo, canoas, bicicleta de montaña, paintball…..desplazándonos a cualquier punto de Andalucía que soliciten nuestros servicios."]
                  :images [["images/segway/about-01.jpg" "images/segway/about-square-01.jpg"]]}
   "/whatis.html" {:title "Que es un Segway"
                   :route detail
                   :url "whatis.html"
                   :paragraphs [
                                 "El Segway es un vehículo de transporte ligero giroscópico eléctrico de dos ruedas, con auto balanceo controlado por ordenador. El ordenador y los motores situados en la base mantienen la base del Segway horizontal todo el tiempo. El usuario se debe inclinar hacia la dirección que quiera tomar (delante, detrás, derecha o izquierda). El motor es eléctrico y silencioso, alcanzando los 20 km/h."]
                   :images [["images/segway/whatis-01.jpg" "images/segway/whatis-square-01.jpg"]]}
   "/holidays.html" {:title "Paquetes Vacationales"
                     :route detail
                     :url "holidays.html"
                     :paragraphs [
                                   "Con estos paquetes vacacionales ofertamos rutas desde 2 días  hasta rutas de 6 días, para los amantes de la naturaleza resaltando los elementos abióticos,  bióticos y tradicionales que sorprenderán a nuestros visitantes ya que Granada es mucho más que su capital y costa. Todas nuestras rutas incluyen:<ul><li>Recogida en aeropuerto, estación de autobuses o tren en Granada. Para recogida en el aeropuerto de Málaga o Sevilla consultar<li>Alojamiento en pensión completa</li><li>Desplazamientos</li><li>Seguros R.C. y AC</li></ul>"
                                   "<h3>2 Noches y 2 Días</h3>El precio del programa es para habitación doble, para habitación individual suplemento 40€.<br/><b>Precio</b><ul><li>300€ por persona</li></ul><b>Programa</b><ul><li><b>Día 1: </b>Recepción, traslado al hotel, cena</li><li><b>Día 2: </b>Ruta en segway, almuerzo, ruta de senderimos o visita cultural</li><li><b>Día 3: </b>Ruta en segway, almuerzo y traslado a punto de partida</li></ul>"
                                   "<h3>4 Noches y 3 Días de rutas en segway</h3>El precio del programa es para habitación doble, para habitación individual suplemento 40€.<br/><b>Precio</b><ul><li>300€ por persona</li></ul><b>Programa</b><ul><li><b>Día 1: </b>Recepción, traslado al hotel, cena</li><li><b>Día 2: </b>Ruta en segway, almuerzo, ruta de senderimos o visita cultural</li><li><b>Día 3: </b>Ruta en segway, almuerzo y traslado a punto de partida</li></ul>"
                                   "<h3>6  Noches y 5 Rutas en segway</h3>El precio del programa es para habitación doble, para habitación individual suplemento 40€.<br/><b>Precio</b><ul><li>300€ por persona</li></ul><b>Programa</b><ul><li><b>Día 1: </b>Recepción, traslado al hotel, cena</li><li><b>Día 2: </b>Ruta en segway, almuerzo, ruta de senderimos o visita cultural</li><li><b>Día 3: </b>Ruta en segway, almuerzo y traslado a punto de partida</li></ul>"]
                     :images [["images/segway/holidays/holidays-01.jpg" "images/segway/holidays/holidays-square-01.jpg"]
                              ["images/segway/holidays/holidays-02.jpg" "images/segway/holidays/holidays-square-02.jpg"]
                              ["images/segway/holidays/holidays-03.jpg" "images/segway/holidays/holidays-square-03.jpg"]
                              ["images/segway/holidays/holidays-04.jpg" "images/segway/holidays/holidays-square-04.jpg"]]}
   "/faq.html" {:title "Preguntas frecuentes"
                :route detail
                :url "faq.html"
                :paragraphs [
                              "<b>¿Qué es un Segway?</b><br/>El Segway es el primer aparato de transporte impulsado eléctricamente que mantiene su propio equilibrio. El Segway es capaz de imitar el equilibrio humano. Nuestros Segway X2 pueden ir por cualquier camino en el que una persona pueda pasear."
                              "<b>¿Cualquiera puede llevar un Segway?</b><br/>La única limitación es el peso del conductor que debe estar entre los 45kg y 110kg."
                              "<b>¿Puedo hacer fotos  videos desde el Segway?</b><br/>Si, para hacer fotos solo es necesario detenerse para tomar la foto sin tener que bajarse del Segway, y los videos incluso con un manejo del Segway mas avanzado podrás grabarlos en movimiento."
                              "<b>¿Las visitas son guiadas?</b><br/>Todas las excursiones se hacen con un guía que dirige la excursión y enseña la conducción del Segway."
                              "<b>¿Pueden montar los niños?</b><br/>No siempre los menores de 12 años pueden llevar el Segway, dado el peso mínimo de 45kg que necesita el Segway para su correcto funcionamiento."
                              "<b>¿Hace falta que llevemos casco?</b><br/>No, el casco lo ponemos nosotros, además de chalecos reflectantes para la mejor visibilidad de los usuarios."
                              "<b>¿Qué ropa tengo que llevar para montar en Segway?</b><br/>La ropa que normalmente lleves en la temporada que vas a hacer las rutas en Segway. En periodos calurosos ropa ligera y; en tiempo frío ropa de abrigo (guantes, gorro, polar, etc.). Aunque es recomendable usar la ropa que llevarías a una excursión al campo."
                              "<b>¿Qué calzado tengo que llevar para montar en Segway?</b><br/>El calzado recomendado para hacer rutas en Segway es calzado atado (no chanclas), ten en cuenta que es como pasear por el monte."]}
   "/home.html" {:title "Segway Granada Ventur"
                 :route index
                 :url "home.html"
                 :banners ["/albaycin.html" "/periurbano.html" "/marquesado.html"]
                 :boxes [
                      {:image ["images/segway/whatis-square-01.jpg" "images/segway/whatis-01.jpg"]
                       :link "/whatis.html"}
                      {:image ["images/segway/helmet.jpg"]
                       :title "Seguridad el lo primero"
                       :paragraph "Somos el unico <a target=\"_blank\" href=\"http://www.segway.es\">Centro Segway certificado</a> en Granada por la circulacion en la carretera; ponemos la seguridad de nuestos clientes antes de todo, desarrolando un curso para aprender a conducir el segway de forma sencilla y segura"}
                      {:image ["images/segway/tracks/tracks-square-01.jpg" "images/segway/tracks/tracks-01.jpg"]
                       :link "/tracks.html"
                       :class "last"}]}})
