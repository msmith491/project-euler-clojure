(ns project-euler.core
  (:gen-class :main true))

(loop
 [x 4]
  (load (format "problem_%s" x))
  (cond
    (< 1 x) (recur (dec x))
    :else nil))

(defn -main
  "Project Euler Problems In Clojure"
  [& args]
  (def t1 (.getTime (java.util.Date.)))
  (if (= (count args) 0)
    (System/exit 0)
    ((resolve
      (symbol "project-euler.core" (first args)))))
  (def t2 (.getTime (java.util.Date.)))
  (println "Time: " (float (/ (- t2 t1) 1000))  , "s"))
