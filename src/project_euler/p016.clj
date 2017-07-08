; 1366
(ns project-euler.p016
  (:require [clojure.math.numeric-tower :as math])
  (:require [project-euler.utils :as utils]))

(def number (math/expt 2 1000))

(defn main
  []
  (utils/sum-of-digits number))

