(defn multiple-of? [num div] (zero? (rem num div)))

(->> (range 1000)
     (filter #(or (multiple-of? % 5) (multiple-of? % 3)))
     (reduce +))