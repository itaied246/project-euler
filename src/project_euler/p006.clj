(ns project-euler.p006
  (:require [clojure.math.numeric-tower :as math]))

(defn sum-of-squares
  [n]
  (->> (range 1 (inc n))
       (map math/sqrt)
       (reduce +)))

(defn square-of-sum
  [n]
  (->> (range 1 (inc n))
       (reduce +)
       (math/sqrt)))

(defn main
  []
  )