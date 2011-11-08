(ns segway.pages.detail
  (:use segway.pages.common)
  (:require [net.cgrand.enlive-html :as html]))

;; we only want to select p and img
(def *section-sel* [[:#content] :> :p])
(html/defsnippet section-snippet "template/my-style-demo.html" *section-sel*
  [text]
  [:p]  (html/do->
        (html/html-content text)))

(def *image-sel* [:.holder :> :.imgholder])
(html/defsnippet image-snippet "template/my-style-demo.html" *image-sel*
  [image]
  [:div] (html/html-content (str "<a class=\"single_image\" href=\"" (first image) "\"><img alt=\"\" src=\"" (second image) \"" width=\"290\" height=\"290\"/></a>"))
  [:div] (html/set-attr :class "holder imgholder"))

;(html/defsnippet carousel-snippet "template/my-style-demo.html" *image-sel*
;  [image]
;  [:div] (html/content )
;  [:*] (html/set-attr :class "holder imgholder"))

(html/deftemplate detail "template/my-style-demo.html"
  [{:keys [title paragraphs images]}]

  [:script] (html/clone-for [script ["scripts/jquery-1.4.1.min.js" "scripts/jquery.fancybox-1.3.4/fancybox/jquery.fancybox-1.3.4.pack.js" "scripts/jquery.fancybox-1.3.4/fancybox/jquery.easing-1.3.pack.js" "scripts/jquery.fancybox-1.3.4/fancybox/jquery.mousewheel-3.0.4.pack.js" "inline"]]
                (if (not (= (str script) "inline"))
                  (html/do->
                    (html/set-attr :src script)
                    (html/content ""))
                  (html/content "$(document).ready(function() { $(\"a.single_image\").fancybox();});")))

  ;;@TODO Experiment Template inheritance
  [:title] (html/content "Segway Granada Ventur - " title)
  [:link] (html/html-content "<link rel=\"stylesheet\" href=\"scripts/jquery.fancybox-1.3.4/fancybox/jquery.fancybox-1.3.4.css\" type=\"text/css\" media=\"screen\" />")

  ;;Structure - using snippets in segway.pages.common
  ;;@TODO Here we're not using map in the right way, we should just apply the snippet function
  [:#header]   (html/content (map #(header-snippet %) [0]))
  [:#footer]   (html/content (map #(footer-snippet %) [0]))
  [:.fl_left]   (html/content (map #(copyright-snippet %) [0]))

  ;;Breadcrumb
  [:#breadcrumb :ul :li] (html/substitute "")
  [:#breadcrumb :ul] (html/html-content "<li><a href=\"index.html\">Home</a></li><li> » </li>Rutas</li><li> » </li><li class=\"current\">" title "</li>")

  ;;Page content
  [:#container :h1] (html/content title)
  [:#content]   (html/content (map #(section-snippet %) paragraphs))
;  [:#content] (html/append (html/html-content "<br/>"))
  ;;Images carousel
;  [:#column (html/nth-last-child 0 1)] (html/clone-for [id ["1" "2"]]
;                (html/set-attr :id id))

; <div style=\"margin:20;float:left\" class=\"holder imgholder\">

  [:#carousel :a] (html/clone-for [image (rest images)] (html/html-content (str "<a style=\"margin:10px;float:left\" class=\"single_image\" href=\"" (first image) "\"><img style=\"border:1px solid\" src=\"" (second image) \"" width=\"120\" height=\"120\"/></a>")))
;  [:#carousel] (html/content (map #(carousel-snippet %) (rest images)))

  ;;Right Column
  [:.subnav] (html/substitute "")
  [:.holder] (html/substitute "")
  [:#column]   (html/content (map #(image-snippet %) [(first images)])))