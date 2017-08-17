(in-ns 'project-euler.core)

(defn problem-5 []
  (println "Smallest Multiple")

  (defn all-div [x n]
    (loop [curr n]
      (if (not= 0 (mod x curr))
        false
        (if (= 1 curr)
          true
          (recur (dec curr))))))

  (defn smallest-multiple [n]
    (first (filter #(all-div % n) (range 2520 Long/MAX_VALUE 2520))))

  (println (smallest-multiple 20)))
