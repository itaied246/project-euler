(def numbers (range 1 1000))
(def divisors [3 5])

(defn divided-by-one-of-divisors? 
    [number]
    (reduce
        (fn [result divisor] (or result (zero? (mod number divisor))))
        false
        divisors))

(defn solution
    [numbers]
    (reduce 
        + 
        (filter divided-by-one-of-divisors? numbers)))

; (solution numbers)