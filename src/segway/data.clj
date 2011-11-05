(ns segway.data
  (:use segway.pages.home
        segway.pages.route))

(def webdata
  {"/route-1.html"  {:title "Miradores del Albaicin-Sacromonte"
                    :route route
                    :url "route-1.html"
                    :sections [{:text "Descubriremos el  Albaicín  y el Sacromonte  a través de sus miradores (San Cristóbal, Sacromonte, Carvajales, Lona, Huerto del Carlos, San Nicolás), calles y callejones, iglesias y rincones abalconados."
                        :image "images/segway/albaicin380.JPG"}
                       {:text "Un recorrido intimo para el disfrute de los sentidos con espectaculares vistas de la Alhambra desde sus diferentes ángulos, ideal para los amantes de la fotografía y un conocimiento más profundo del Barrio acompañados de un guía nacido allí."
                        :image "images/segway/albaicin459.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1h 30m</b></li><li>Tipo de terreno:<b>empedrado</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Mirador de San Nicolás</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>45€ por persona</li></ul>"
                        :image "images/segway/albaicin455.JPG"}]}
   "/route-2.html"  {:title "Parque Peri Urbano de la Alhambra"
                    :route route
                    :url "route-2.html"
                    :sections [{:text "Recorrido tranquilo para disfrutar del segway, con vistas sobre la Alhambra, del valle del rio Darro, Sacromonte y Sierra Nevada, en un entorno natural de pinos y olivar, saliéndonos de los circuitos habituales destacando  los valores paisajísticos de Granada."
                        :image "images/segway/perdiz1.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1h 30m</b></li><li>Tipo de terreno:<b>tierra</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Parking del Generalife.</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>45€ por persona</li></ul>"
                        :image "images/segway/perdiz13.JPG"}]}
   "/route-3.html"  {:title "Sierra de la Alfaguara"
                    :route route
                    :url "route-3.html"
                    :sections [{:text "Al Noroeste  de la capital a unos 20 Km., configura un importante conjunto de geomorfología cárstica que mantiene formaciones de quejigar-encinar, pinares autóctonos y repoblación y numerosos endemismos catalogados en peligro de extinción."
                        :image "images/segway/P1000210.JPG"}
                       {:text "Una ruta para los amantes de la Naturaleza y el senderismo que hará disfrutar al más exigente con  panorámicas vistas de Sierra Nevada en un entorno natural único."
                        :image "images/segway/alfaguara80.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>4h a 5h</b></li><li>Tipo de terreno:<b>caminos tierra</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Centro de visitantes Puerto Lobo.</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"
                        :image "images/segway/alfaguara35.JPG"}]}
   "/route-4.html"  {:title "Comarca del Marquesado"
                    :route route
                    :url "route-4.html"
                    :sections [{:text "Esta ruta la vamos a realizar en la cara Norte  del Parque Nacional de Sierra Nevada en cuyas faldas se sitúa el acogedor pueblo de la Calahorra,  capital de la Comarca del Marquesado del Zenete, con su majestuoso castillo medieval dominando el altiplano granadino."
                        :image "images/segway/marquesado10.JPG"}
                       {:text "Visitaremos Aldeire, pequeño pueblo de estructura árabe, sus castaños centenarios, sus vegas y huertas regadas por las aguas de la rambla de Benejar a través de su intrincada red de acequias que conservan todavía su estructura árabe."
                        :image "images/segway/marquesado8.JPG"}
                       {:text "Ruta donde destacan 3 tipos de paisaje, la llanura y sobre ella las escombreras de las minas, el bosque de rivera  junto a las huertas y castaños centenarios y las vistas sobre las cumbres de Sierra Nevada y sus pinares."
                        :image "images/segway/marquesado12.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"
                        :image "images/segway/marquesado16.JPG"}]}
   "/route-5.html"  {:title "Dólmenes de Gorafe (Desierto granadino)"
                    :route route
                    :url "route-5.html"
                    :sections [{:text "Al Norte de Granada en el Altiplano Granadino y en la depresión Guadix-Baza se encuentra Gorafe a 92 Km. de la capital. Un paisaje que nos sorprenderá a cada momento sobre una tierra colorada semidesértica."
                        :image "images/segway/desierto14.JPG"}
                       {:text "Circularemos por caminos de tierra y ramblas, visitaremos dólmenes, casas cueva y un desierto único en Europa, zona sagrada para sus antiguos pobladores. Visitaremos el balneario de Alicun de las Torres  y una última parada en Gorafe."
                        :image "images/segway/desierto16.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li><li>Tipo de terreno:<b>pistas y ramblas</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>95€ (medio día, ruta segway)</li></ul>"
                        :image "images/segway/desierto10.JPG"}]}
   "/route-6.html"  {:title "Trevenque"
                    :route route
                    :url "route-6.html"
                    :sections [{:text "Recorrido donde nos adentraremos en el Parque Nacional de Sierra Nevada circulando por pistas de tierra hasta llegar al cortijo de la Cortijuela  donde visitaremos su jardín botánico."
                        :image "images/segway/trevenque297.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li><li>Tipo de terreno:<b>caminos y veredas</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ (medio día, ruta segway mas visita a jardín botánico)</li></ul>"
                        :image "images/segway/trevenque2.JPG"}]}
   "/route-7.html"  {:title "Arco Noreste de la Vega de Granada"
                    :route route
                    :url "route-7.html"
                    :sections [{:text "El Arco Noroeste de la Vega de Granada está formado por 12  pueblos (  Alfacar- Beas de Granada- Calicasas- Cogollos Vega- Dudar- Guejar Sierra- Guevejar-Huetor Santillán- Nivar- Pinos Genil- Quentar- Viznar )  enclavados en dos espacios protegidos el Parque Natural de Sierra de Huetor y el Parque Nacional de Sierra Nevada y a escasos kilómetros de Granada."
                        :image "images/segway/huetor1.JPG"}
                       {:text "Son pueblos pequeños de calles estrechas, encaladas conservando todavía ese aire de pueblo,  su identidad sin dar la espalda a la modernidad y con un nexo de unión –el agua- en sus numerosos nacimientos y acequias."
                        :image "images/segway/P1000760.JPG"}
                       {:text "Las rutas que realizamos en estos pueblos son de una hora de duración para que los visitantes  recorran y conozcan sus rincones de una manera diferente y como herramienta para los propietarios de casas rurales y hoteles ofrezcan un producto diferente que contribuya al desarrollo sostenible de su comarca."
                        :image "images/segway/P1000780.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>hora y media aproximada</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recorridos en el parque Sierra de Huetor</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"
                        :image "images/segway/P1000795.JPG"}]}
   "/route-8.html"  {:title "Dehesa del Camarate"
                    :route route
                    :url "route-8.html"
                    :sections [{:text "La dehesa del Camarate se encuentra situada en la cara Norte del Parque Nacional de Sierra Nevada en Lugros ,en  esta se encuentra el único bosque sub-mediterráneo de toda la sierra formado por arces, hayas, robles, quejigos, cerezos silvestres, encinas en su parte baja y un esplendido bosque de rivera a lo largo del río Alhama."
                        :image "images/segway/P1000761.JPG"}
                       {:text "Este paraje único para la flora se ha conservado gracias a la ganadería de reses bravas que pasta en esta dehesa. Subiremos al Cerro del Carnero a 1730 m, mirador sobre la dehesa y cumbres de la sierra. La mejor época para visitarla es en otoño cuando el bosque toma todas las tonalidades rojas de los arces y quejigos."
                        :image "images/segway/P1000759.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>Medio dia</b></li><li>Tipo de terreno:<b>tierra mixta segway-senderismo</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>75€ por persona</li></ul>"
                        :image "images/segway/P1000751.JPG"}]}
   "/route-9.html"  {:title "Fuente de la Teja"
                    :route route
                    :url "route-9.html"
                    :sections [{:text "Güejar Sierra, es un pueblo blanco de calles estrechas y empinadas que conserva todavía el encanto natural cuya principal característica es el agua, destacando su fuente de los 16 caños. Enclavado en el Parque Nacional de Sierra Nevada junto al cauce del rio Genil y el embalse de Canales,  es  balcón privilegiado con fabulosas vistas sobre los picos más altos de la sierra, la Alcazaba y el Mulhacen en un paisaje de castaños, tilos, nogales, encinas, almeses, que impresiona al visitante. Además encontraremos una gastronomía rica en matices y aromas de montaña."
                        :image "images/segway/P1010254.JPG"}
                       {:text "Nuestras ruta las realizaremos en un paraje idílico, “Fuente la Teja” lugar que nos da una gran variedad de recorridos con una tranquilidad absoluta y un paisaje salido de los mejores pintores. Observaremos, castaños, encinas, pinos, vegetación de media montaña y en su parte más baja almendros y olivos, terminando en la casa rural del mismo nombre donde podremos degustar la gastronomía típica de la zona. También realizamos salidas desde el camping las Lomas hasta el pueblo o a  Fuente la Teja."
                        :image "images/segway/P1010297.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>De 30 minutos a 2 horas</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Casa Rural Fuente la Teja</li><li>Camping Las Lomas</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ segun recorrido</li></ul>"
                        :image "images/segway/marquesado16.JPG"}]}
   "/route-10.html"  {:title "Ciudad de Guadix"
                    :route route
                    :url "route-10.html"
                    :sections [{:text "Esta ruta la vamos a realizar en la Ciudad de Guadix (su significado árabe-Rio de la Vida), situada al noroeste de la capital granadina a unos 60 kilómetros y en la cara Norte de Sierra Nevada, asentada sobre una hoya en la que se alternan los ríos, tierras áridas, planicies de cereal y formaciones arcillosas fuertemente erosionadas."
                        :image "images/segway/P1000697.JPG"}
                       {:text "Su casco histórico podemos decir que se acerca mas a la tipología castellana que andaluza, destacando las portadas renacentistas o su Catedral una mezcla gótica, renacentista y barroca construida sobre la antigua mezquita es uno de los conjuntos arquitectónicos más atrevidos del barroco."
                        :image "images/segway/P1000673.JPG"}
                       {:text "Recorreremos los estrechos callejones de la judería, el barrio de Santa Ana que conserva todavía su trazado morisco y pasaremos por las casas señoriales de los siglos XVIII y XIX sin olvidar las tradicionales casas cueva que le han dado fama mundial."
                        :image "images/segway/P1000713.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>De 1 hora y media a 2 horas</b></li><li>Tipo de terreno:<b>Asfalto</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"
                        :image "images/segway/P1000727.JPG"}]}
   "/route-11.html"  {:title "Dílar"
                    :route route
                    :url "route-11.html"
                    :sections [{:text "Esta ruta la realizamos en el pueblo de Dilar, frontera entre la vega y la sierra,   mirador privilegiado entre olivares y almendros en la salida del río del mismo nombre de la Sierra a la Vega."
                        :image "images/segway/P1010347.JPG"}
                       {:text "A unos 18 kilómetros de Granada, entre calles estrechas, blancas, con rincones de agua. Una ruta tranquila por tierra junto a  pinares, olivos y almendros, disfrutando de las vistas de la Sierra –Boca de la Pesca – Trevenque – Pico del Caballo -, llanos de Gojar y la Vega."
                        :image "images/segway/P1010367.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>De 1 a 2 horas según ruta</b></li><li>Tipo de terreno:<b>tierra</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Junto al hotel Zerlúnetta</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60€ por persona</li></ul>"
                        :image "images/segway/P1010380.JPG"}]}
   "/route-12.html"  {:title "Tranvía de la Sierra"
                    :route route
                    :url "route-12.html"
                    :sections [{:text "Güejar Sierra, es un pueblo blanco de calles estrechas y empinadas que conserva todavía el encanto natural cuya principal característica es el agua, destacando su fuente de los 16 caños. Enclavado en el Parque Nacional de Sierra Nevada junto al cauce del rio Genil y el embalse de Canales,  es  balcón privilegiado con fabulosas vistas sobre los picos más altos de la sierra, la Alcazaba y el Mulhacen en un paisaje de castaños, tilos, nogales, encinas, almeses, que impresiona al visitante. Además encontraremos una gastronomía rica en matices y aromas de montaña."
                        :image "images/segway/marquesado10.JPG"}
                       {:text "Esta ruta la vamos a realizar por el recorrido que hacia el antiguo tranvía de Granada al Charcón, desde la estación de Güejar Sierra hasta el Barranco de San Juan. Un recorrido junto al rio Genil sin grandes pendientes, circulando por puentes y túneles con unas vistas sobre el castañar, acompañados en todo momento por el murmullo del agua del rio."
                        :image "images/segway/marquesado8.JPG"}
                       {:text "Observando las construcciones típicas de montaña, las estaciones del tranvía , una vegetación de rivera, llevando a nuestra derecha la mítica Vereda de la Estrella que conduce a los amantes de la montaña al corazón de Sierra Nevada y al nacimiento del Genil .A la vuelta en la estación del Maitena tomaremos altura para tener unas vista sobre el pantano y el pueblo de Güejar el cual recorreremos sus callejas blancas, amacetadas y estrechas para bajar por el camino de la estación a nuestro punto de partida."
                        :image "images/segway/marquesado12.JPG"}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>1 a 2.30 h según recorrido</b></li><li>Tipo de terreno:<b>tierra y asfalto</b></li><li>Grupos:<b>2 a 4 personas, menor consultar</b></li></ul><b>PUNTO DE ENCUENTRO</b><ul><li>Puente de la fábrica de luz junto a la cola del pantano</li><li>Estación de Maitena</li><li>Recogemos a los clientes</li></ul><b>HORAS DE SALIDA</b><ul><li>Sin determinar, Por reserva</li></ul><b>PRECIOS</b><ul><li>60 euros por persona y según recorrido</li><li>75 euros con recogida en Granada y comida.</li></ul>"
                        :image "images/segway/marquesado16.JPG"}]}
   "/tracks.html"  {:title "Circuitos"
                    :route route
                    :url "tracks.html"
                    :sections [{:text "Los circuitos segway los utilizamos en Fiestas Patronales, Fiestas Deportivas, Semanas Culturales, Institutos, etc. para que disfruten todos los participantes de una sensación única sobre un vehículo novedoso, no contaminante y divertido. Para que los vecinos y las personas que visitan el municipio lo recorran de una manera diferente, como incentivo de empresas, para publicitar la apertura de un comercio o local con una actividad novedosa y llamativa."
                        :image "images/segway/P1010149.JPG"}
                       {:text "Programar una actividad diferente, que pueda sorprender y que además valla dirigida al público adulto, ya ha dejado de ser un problema. Con la experiencia adquirida, hemos podido constatar que la actividad que proponemos con nuestros innovadores segway x2 tiene el éxito garantizado."
                        :image "images/segway/P1010136.JPG"}
                       {:text "La actividad consistirá en ofrecer a todos los asistentes a los actos organizados, la posibilidad de montar en un segway. Las necesidades técnicas son mínimas ya que solo necesitamos un espacio llano y libre de obstáculos."
                        :image "images/segway/P1010135.JPG"}
                       {:text "En este espacio formamos a los participantes en grupos de 4, siempre de uno en uno y de manera controlada por un monitor, una vez formados saldremos del recinto para hacer un pequeño recorrido por el entorno acompañados siempre del monitor."}
                       {:text "<b>CARACTERÍSTICAS</b><ul><li>Tiempo estimado:<b>3 horas</b></li></ul><b>PRECIOS</b><ul><li>400 euros</li><li>75 euros con recogida en Granada y comida.</li></ul><b>INCLUYDO</b><ul><li>4 segway para realizar el circuito</li><li>Segway del monitor</li><li>Monitores-guía</li><li>Cascos</li><li>Material de señalización</li><li>Seguros obligatorios</li><li>3 horas de duración del circuito</li></ul>"}]}
   "/about.html"  {:title "Quienes Somos"
                    :route route
                    :url "about.html"
                    :sections [{:text "Miguel Algarra nacido 1962 en el Albaycín, amante de la naturaleza,  tras diferentes etapas relacionadas con  el medio natural,  el turismo activo y  varios años de formación crea una empresa con un grupo de personas jóvenes que apuestan  por un ecoturismo  sobre  ruedas,   respetuoso con el medio ambiente en un entorno  poco conocido, intimo y con  encanto natural. Basada en dar a conocer nuestros parques  naturales,  Sierra Nevada ,Sierra de  Huetor, comarca Guadix…., y  pueblos, con rutas alternativas, alojamientos singulares y gastronomía típica.  Pensando en un desarrollo sostenible de nuestra tierra  y como principio, el disfrute de nuestros clientes y su satisfacción, queriendo ofrecer  el mayor grado de calidad, trabajando con grupos reducidos de 4 personas  para los segway."
                        :image "images/segway/pirata.jpg"}
                       {:text "Ofrecemos la posibilidad de disfrutar de este entorno a personas que bien por sus  condicionantes físicos o de falta de tiempo no    podrían disfrutar del mismo, una forma diferente de hacer turismo. El ocio y el disfrute paisajístico y cultural desde este entorno natural, nos ofrece una visión muy particular de un  Albaycinero  mostrando  nuestra ciudad más allá de las obligadas visitas turísticas de la capital y la provincia que no debemos perdernos; GRANADA ES MUCHO MÁS"}
                       {:text "Estamos situados en el parque natural de Sierra de Huetor en el pueblo de Alfacar, a 7 Km de Granada capital, pero aunque nuestra central esté aquí situada, nuestra empresa ofrece al visitante el servicio de desplazamiento desde su alojamiento hasta la zona en la que vamos a realizar la actividad."}
                       {:text "Pero nuestra actividad no se limita solo a las rutas en segway, también ofrecemos al cliente la posibilidad de elaborar paquetes de actividades  de uno o varios días, alternando las rutas en segway  con rutas de senderismo, canoas, bicicleta de montaña, paintball…..desplazándonos a cualquier punto de Andalucía que soliciten nuestros servicios."}]}
   "/whatis.html"  {:title "Que es un Segway"
                    :route route
                    :url "whatis.html"
                    :sections [{:text "Miguel Algarra nacido 1962 en el Albaycín, amante de la naturaleza,  tras diferentes etapas relacionadas con  el medio natural,  el turismo activo y  varios años de formación crea una empresa con un grupo de personas jóvenes que apuestan  por un ecoturismo  sobre  ruedas,   respetuoso con el medio ambiente en un entorno  poco conocido, intimo y con  encanto natural. Basada en dar a conocer nuestros parques  naturales,  Sierra Nevada ,Sierra de  Huetor, comarca Guadix…., y  pueblos, con rutas alternativas, alojamientos singulares y gastronomía típica.  Pensando en un desarrollo sostenible de nuestra tierra  y como principio, el disfrute de nuestros clientes y su satisfacción, queriendo ofrecer  el mayor grado de calidad, trabajando con grupos reducidos de 4 personas  para los segway."
                        :image "images/segway/seg1.jpg"}]}
   "/holidays.html"  {:title "Paquetes Vacationales"
                    :route route
                    :url "whatis.html"
                    :sections [{:text "Con estos paquetes vacacionales ofertamos rutas desde 2 días  hasta rutas de 6 días, para los amantes de la naturaleza resaltando los elementos abióticos,  bióticos y tradicionales que sorprenderán a nuestros visitantes ya que Granada es mucho más que su capital y costa. Todas nuestras rutas incluyen:<ul><li>Recogida en aeropuerto, estación de autobuses o tren en Granada. Para recogida en el aeropuerto de Málaga o Sevilla consultar<li>Alojamiento en pensión completa</li><li>Desplazamientos</li><li>Seguros R.C. y AC</li></ul>"
                        :image "images/segway/pirata.jpg"}
                       {:text "<h3>2 Noches y 2 Días</h3>El precio del programa es para habitación doble, para habitación individual suplemento 40€.<br/><b>Precio</b><ul><li>300€ por persona</li></ul><b>Programa</b><ul><li><b>Día 1: </b>Recepción, traslado al hotel, cena</li><li><b>Día 2: </b>Ruta en segway, almuerzo, ruta de senderimos o visita cultural</li><li><b>Día 3: </b>Ruta en segway, almuerzo y traslado a punto de partida</li></ul>"
                        :image "images/segway/desierto11.jpg"}
                       {:text "<h3>4 Noches y 3 Días de rutas en segway</h3>El precio del programa es para habitación doble, para habitación individual suplemento 40€.<br/><b>Precio</b><ul><li>300€ por persona</li></ul><b>Programa</b><ul><li><b>Día 1: </b>Recepción, traslado al hotel, cena</li><li><b>Día 2: </b>Ruta en segway, almuerzo, ruta de senderimos o visita cultural</li><li><b>Día 3: </b>Ruta en segway, almuerzo y traslado a punto de partida</li></ul>"
                        :image "images/segway/marquesado15.jpg"}
                       {:text "<h3>6  Noches y 5 Rutas en segway</h3>El precio del programa es para habitación doble, para habitación individual suplemento 40€.<br/><b>Precio</b><ul><li>300€ por persona</li></ul><b>Programa</b><ul><li><b>Día 1: </b>Recepción, traslado al hotel, cena</li><li><b>Día 2: </b>Ruta en segway, almuerzo, ruta de senderimos o visita cultural</li><li><b>Día 3: </b>Ruta en segway, almuerzo y traslado a punto de partida</li></ul>"
                        :image "images/segway/trevenque199.jpg"}]}
   "/faq.html"  {:title "Preguntas frecuentes"
                    :route route
                    :url "faq.html"
                    :sections [{:text "<b>¿Qué es un Segway?</b><br/>El Segway es el primer aparato de transporte impulsado eléctricamente que mantiene su propio equilibrio. El Segway es capaz de imitar el equilibrio humano. Nuestros Segway X2 pueden ir por cualquier camino en el que una persona pueda pasear."}
                               {:text "<b>¿Cualquiera puede llevar un Segway?</b><br/>La única limitación es el peso del conductor que debe estar entre los 45kg y 110kg."}
                               {:text "<b>¿Puedo hacer fotos  videos desde el Segway?</b><br/>Si, para hacer fotos solo es necesario detenerse para tomar la foto sin tener que bajarse del Segway, y los videos incluso con un manejo del Segway mas avanzado podrás grabarlos en movimiento."}
                               {:text "<b>¿Las visitas son guiadas?</b><br/>Todas las excursiones se hacen con un guía que dirige la excursión y enseña la conducción del Segway."}
                               {:text "<b>¿Pueden montar los niños?</b><br/>No siempre los menores de 12 años pueden llevar el Segway, dado el peso mínimo de 45kg que necesita el Segway para su correcto funcionamiento."}
                               {:text "<b>¿Hace falta que llevemos casco?</b><br/>No, el casco lo ponemos nosotros, además de chalecos reflectantes para la mejor visibilidad de los usuarios."}
                               {:text "<b>¿Qué ropa tengo que llevar para montar en Segway?</b><br/>La ropa que normalmente lleves en la temporada que vas a hacer las rutas en Segway. En periodos calurosos ropa ligera y; en tiempo frío ropa de abrigo (guantes, gorro, polar, etc.). Aunque es recomendable usar la ropa que llevarías a una excursión al campo."}
                               {:text "<b>¿Qué calzado tengo que llevar para montar en Segway?</b><br/>El calzado recomendado para hacer rutas en Segway es calzado atado (no chanclas), ten en cuenta que es como pasear por el monte."}]}
   "/home.html" {:route index }})


















