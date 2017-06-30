; 233168
(ns project-euler.p001)

(defn multiple-of? [num div] (zero? (rem num div)))

(defn main
  []
  (->> (range 1000)
       (filter #(or (multiple-of? % 5) (multiple-of? % 3)))
       (reduce +)))