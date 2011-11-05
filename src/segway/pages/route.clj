(ns segway.pages.route
  (:use segway.pages.common)
  (:require [net.cgrand.enlive-html :as html]))

;; we only want to select p and img
(def *section-sel* {[[:#content] :> :img] [[:#content] :> :p]})

(html/defsnippet section-model "template/my-style-demo.html" *section-sel*
  [{:keys [text image]}]

  [:img] (fn [match]
                 (if image (do
                   ((html/set-attr :height "125") match)
                   ((html/set-attr :width "125") match)
                   ((html/set-attr :class "imgr") match)
                   ((html/set-attr :src image) match))
                 ((html/substitute "") match)))
;  [:img] (html/do->
;
;        (html/set-attr :width "125")
;        ;;@TODO alternate imgl/imgr on odd/even elements
;        (html/set-attr :class "imgr")
;        (html/set-attr :src image))
  [:p]  (html/do->
        (html/html-content text)))

(html/deftemplate route "template/my-style-demo.html"
  [{:keys [title sections]}]

  [:title] (html/content "Segway Granada Ventur - " title)

  ;;Structure - using snippets in segway.pages.common
  ;;@TODO Here we're not using map in the right way, we should just apply the snippet function
  [:#header]   (html/content (map #(header-snippet %) [0]))
  [:#footer]   (html/content (map #(footer-snippet %) [0]))
  [:.fl_left]   (html/content (map #(copyright-snippet %) [0]))

  ;;Breadcrumb
  [:#breadcrumb :ul :li] (html/substitute "")
  [:#breadcrumb :ul] (html/html-content "<li><a href=\"index\">Home</a></li><li> » </li>Rutas</li><li> » </li><li class=\"current\">" title "</li>")

  ;;Page content
  [:#content]   (html/content (map #(section-model %) sections))
  [:#container :h1] (html/content title))
