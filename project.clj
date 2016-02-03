(defproject hello-web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]]
  :plugins [[lein-ring "0.9.7"]
            [speclj "3.3.1"]]
  :test-paths ["spec" "test"]
  :ring {:handler hello-web.handler/app
         :init hello-web.handler/init
         :destroy hello-web.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"]
                   [ring/ring-devel "1.4.0"]
                   [speclj "3.3.1"]]}})
