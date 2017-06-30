; 232792560
(ns project-euler.p005
  (:require [clojure.math.numeric-tower :as math]))

(defn main
  []
  (reduce math/lcm (range 1 21)))
