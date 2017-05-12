;(max-prime-factor 600851475143)

(defn min-prime-factor
      [n]
       (first (filter #(zero? (rem n %)) (range 2 (inc n)))))

(defn max-prime-factor
      [n]
      (let [k (min-prime-factor n)]
           (if (= n k)
             k
             (recur (/ n k)))))
