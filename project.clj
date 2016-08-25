(defproject my-first-pipeline "0.1.0"
            :description "Plays with pipelines in the LambdaCD world."
            :url "http://example.com/FIXME"
            :dependencies [[lambdacd "0.9.3"]]
                          [lambdacd-git "0.1.6"]
                          [ring-server "0.3.1"]
                          [org.clojure/clojure "1.7.0"]
                          [org.clojure/tools.logging "0.3.0"]
                          [org.slf4j/slf4j-api "1.7.5"]
                          [ch.qos.logback/logback-core "1.0.13"]
                          [ch.qos.logback/logback-classic "1.0.13"]
            :profiles {:uberjar {:aot :all}}
            :main my-first-pipeline.core)
