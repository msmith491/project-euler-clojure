(ns project-euler.core
  (:gen-class :main true))
(load "problem_1")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ; (println (format "args: %s" args))
  (if (= (count args) 0)
    (System/exit 0)
      ((resolve
          (symbol "project-euler.core" (first args))))))
