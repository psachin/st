(ns st.core
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))


(defn tolerance-radius
  "Tolerance radius which should build a candidate segment based on
  nodes(points) from the terminal.
REAL: Real point.
OBSERVED: Points detected from sensor.
TOLERANCE: Radius from real(point). Should be in meters."
  [real observed & tolerance]
  (if (compare real observed)
    (println "Compared")
    (println "Not compared")))


(defn detect-candidate
  "Get corresponding data from user's device, filter the data and
  prepare for processing.
NODES: Should be from the database.
TICKS: Are the point from sensors.
TOLERANCE: Radius from node. Should be in meters"
  [nodes ticks & tolerance]
  (println ticks))


(defn spatial
  "Determine the probability of road nodes building the segment the
  person moved on.
NODES:
TICKS:
VARIANCE:
MU:
XJI:
SIGMA:
"
  [nodes ticks variance mu sigma xji]
  (let* [pi 3.14
         first-term (/ 1 (math/sqrt (* 2 pi variance)))
         second-term (/ (- (* xji xji) (* mu mu)) (* 2 (* sigma sigma)))
         ]
    (println (* first-term second-term))
    )
  (println nodes, ticks))


(defn temporal
  "Velocity with the person moved between two points.
P1: Point-1(in meter).
P2: Point-2(in meter).
T: time(in seconds)."
  [p1 p2 t]
  (println (/ (- p2 p1) t)))


(defn fin-result
  "Final results after spatial and temporal results are available."
  [spatial temporal]
  (println "Result from fin-result"))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Spatial-Temporal Analysis\n----------------")
  (detect-candidate [1,2,3] [1,2,3])
  (spatial [8,9] [6,7] 1.5 3 5 1.2)
  (temporal 2.0 7 3.2)
  (tolerance-radius 2 3)
  (fin-result 2 3))
