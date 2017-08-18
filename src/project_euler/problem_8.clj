(in-ns 'project-euler.core)

(defn problem-8 []
  (println "Largest Product In Series")

  (def series (into [] (map #(Character/digit % 10) (filter #(Character/isDigit %) (slurp "src/project_euler/problem_8.txt")))))

  (defn product [s]
    (reduce * 1 s))

  (defn prod-at-index [i]
    (product (subvec series i (+ i 13))))

  (println (apply max
                  (map #(prod-at-index %)
                       (range (- (count series) 13))))))
