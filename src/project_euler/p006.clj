; 25164150
(ns project-euler.p006
  (:require [clojure.math.numeric-tower :as math]))

(def numbers 100)

(defn expt-2
  [x]
  (math/expt x 2))

(defn sum-of-squares
  [n]
  (->> (range 1 (inc n))
       (map expt-2)
       (reduce +)))

(defn square-of-sum
  [n]
  (->> (range 1 (inc n))
       (reduce +)
       expt-2))

(defn main
  []
  (math/abs
    (- (sum-of-squares numbers) (square-of-sum numbers))))