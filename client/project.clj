(defproject community "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [om "0.6.4"]
                 [sablono "0.2.17"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :cljsbuild {:builds [{:id "community-dev"
                        :source-paths ["src"]
                        :compiler {:output-to "../public/client/client-dev.js"
                                   :output-dir "../public/client/client-dev"
                                   :optimizations :simple
                                   :pretty-print true
                                   :source-map "../public/client/client-dev.js.map"}}
                       {:id "community-prod"
                        :source-paths ["src"]
                        :compiler {:output-to "../app/assets/javascripts/client-prod.js"
                                   :optimizations :advanced
                                   :pretty-print false
                                   :externs ["react-externs.js" "markdown-externs.js"]}}]})
