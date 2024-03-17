(defproject clj-back "0.1.0"

  :description "This is a simple clojure backend that use a jetty server."
  :url "https://github.com/rafael-nearshoredev/clojure-ring-backend"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :min-lein-version "2.0.0"

  :source-paths ["src"]
  :test-paths ["test"]
  :resource-paths ["resources"]
  :target-path "target/%s/"
  :main ^:skip-aot clj-back.core

  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.11.0"]
                 [ring/ring-jetty-adapter "1.11.0"]
                 [mount "0.1.18"]
                 [nrepl "1.0.0"]
                 [cider/cider-nrepl "0.28.5"]
                 [org.clojure/tools.logging "1.2.4"]]

  :repl-options {:init-ns clj-back.core})
