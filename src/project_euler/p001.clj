(->> (range 1000)
     (filter #(or (zero? (rem % 5)) (zero? (rem % 3))))
     (reduce +))