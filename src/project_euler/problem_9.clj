(in-ns 'project-euler.core)

(defn problem-9 []
  (println "Special Pythagorean Triplet")

  (defn is-trip? [a b c]
    (= (* c c) (+ (* a a) (* b b))))

  (defn big-trip-equals [n]
    (first (for [c (range n 1 -5)
                 b (range c 1 -5)
                 a (range b 1 -5)
                 :let [d (+ a b c)]
                 :when (and (= n d)
                            (is-trip? a b c))]
             (* a b c))))

  (println (big-trip-equals 1000)))
