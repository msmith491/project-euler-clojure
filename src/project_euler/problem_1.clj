(in-ns 'project-euler.core)

(defn problem-1 []
  (println "Multiples of 3 and 5")
  (defn mult-3-5 [n]
    (if (or (= 0 (mod n 3))
            (= 0 (mod n 5)))
      n
      0))
  (defn result [n]
    (apply + (map mult-3-5 (range 1 n))))
  (println (result 1000)))
