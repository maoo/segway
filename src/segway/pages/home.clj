(ns segway.pages.home
  (:use segway.pages.common
        segway.data)
  (:require [net.cgrand.enlive-html :as html]))

(def *banner-sel* [:#banner1])
(html/defsnippet banner-snippet "template/my-index.html" *banner-sel*
  [banner]
  [:div :h2] (html/content (:title (get segway.data/webdata banner)))
  [:div :p] (html/content (first (:paragraphs (get segway.data/webdata banner))))
  [:p.readmore] (html/html-content (str "<a href=\"" (:url (get segway.data/webdata banner)) "\">Leér mas &raquo;</a>"))
  [:img] (html/set-attr :src (first (first (:images (get segway.data/webdata banner))))))

(def *box-sel* [:#box1])
(html/defsnippet box-snippet "template/my-index.html" *box-sel*
  [box]
  [:li] (html/set-attr :id "")
  [:li] (html/set-attr :class (:class box))
  [:h2] (html/html-content "<img width=\"60\" height=\"60\" src=\"" (first (:image box)) "\"/> " (if-let [title (:title box)] title (:title (get segway.data/webdata (:link box)))))
  [:p] (html/html-content (if-let [paragraph (:paragraph box)] paragraph (first (:paragraphs (get segway.data/webdata (:link box))))))
  [:p.readmore] (html/html-content (if-let [link (:link box)] (str "<a href=\"" link "\">Leér mas &raquo;</a>") "")))

(html/deftemplate index "template/my-index.html"
  [{:keys [title banners boxes]}]

  ;;@TODO Experiment Template inheritance
  [:title] (html/content "Segway Granada Ventur")

  [:script] (html/clone-for [script ["scripts/jquery-1.4.1.min.js" "scripts/jquery.jcarousel.pack.js" "scripts/jquery.jcarousel.setup.js" "scripts/jquery.fancybox-1.3.4/fancybox/jquery.fancybox-1.3.4.pack.js" "scripts/jquery.fancybox-1.3.4/fancybox/jquery.easing-1.3.pack.js" "scripts/jquery.fancybox-1.3.4/fancybox/jquery.mousewheel-3.0.4.pack.js" "inline"]]
                (if (not (= (str script) "inline"))
                  (html/do->
                    (html/set-attr :src script)
                    (html/content ""))
                  (html/content "$(document).ready(function() { $(\"a.single_image\").fancybox();});")))

  [:link] (html/html-content "<link rel=\"stylesheet\" href=\"scripts/jquery.fancybox-1.3.4/fancybox/jquery.fancybox-1.3.4.css\" type=\"text/css\" media=\"screen\" />")

  ;;Structure - using snippets in segway.pages.common
  ;;@TODO Here we're not using map in the right way, we should just apply the snippet function
  [:#header]   (html/content (map #(header-snippet %) [0]))
  [:#footer]   (html/content (map #(footer-snippet %) [(mapcat :images (vals segway.data/webdata))]))
  [:.fl_left]   (html/content (map #(copyright-snippet %) [0]))

  ;; Home Contents
  [:#featured_content :ul] (html/content (map #(banner-snippet %) banners))
  [:.homepage :ul] (html/content (map #(box-snippet %) boxes))
)