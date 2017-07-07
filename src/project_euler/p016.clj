; 1366
(ns project-euler.p016
  (:require [clojure.math.numeric-tower :as math]))

(def number (math/expt 2 1000))

(defn sum-of-digits
  ([n] (sum-of-digits n 0))
  ([n sum]
    (if (zero? n)
      sum
      (recur (quot n 10) (+ sum (rem n 10))))))

(defn main
  []
  (sum-of-digits number))

