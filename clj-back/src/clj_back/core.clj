(ns clj-back.core
  (:require [ring.adapter.jetty :as jetty]
            [clojure.tools.logging :as log]
            [mount.core :refer [defstate start-with-args]]
            [clj-back.handler :refer [handler]]
            [clj-back.nrepl :as nrepl]))


(defstate ^{:on-reload :noop} jetty-server
  :start (jetty/run-jetty handler {:port 2222
                                   :join? false}))


(defstate ^{:on-reload :noop} repl-server
  :start
  (do (println "Starting nrepl server on bind")
      (nrepl/start {:bind "0.0.0.0"
                    :port 7007})))
:stop
(println "We are not able to close it yet")
#_(when repl-server
  (nrepl/stop repl-server))


(defn start-app
  [args]
  (doseq [component (-> args
                        start-with-args
                        :started)]
    (log/info component "started")))

(defn -main
  "Main application"
  [& args]
  (try
    (start-app args)
    (println "Hey\nThe app is up and running")
    (catch Exception e
      (println "*********ERROR STARTING BACKEND*********")
      (prn e))))
