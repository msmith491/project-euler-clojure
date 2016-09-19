(ns project-euler.core
  (:gen-class :main true))
(load "problem_1")
(load "problem_2")

(defn -main
  "Project Euler Problems In Clojure"
  [& args]
  (if (= (count args) 0)
    (System/exit 0)
      ((resolve
          (symbol "project-euler.core" (first args))))))
