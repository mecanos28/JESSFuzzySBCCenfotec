(deftemplate temperature
  (slot value))

(deftemplate humidity
  (slot value))

(deftemplate fan-output
  (slot speed))

(defrule low-temp-low-humidity
  (temperature (value ?t&:(< ?t 20)))
  (humidity (value ?h&:(< ?h 50)))
  =>
  (assert (fan-output (speed "low"))))

(defrule medium-temp-or-medium-humidity
  (temperature (value ?t&:(and (>= ?t 20) (< ?t 30))))
  (humidity (value ?h&:(and (>= ?h 50) (< ?h 70))))
  =>
  (assert (fan-output (speed "medium"))))

(defrule high-temp-or-high-humidity
  (or
    (temperature (value ?t&:(>= ?t 30)))
    (humidity (value ?h&:(>= ?h 70))))
  =>
  (assert (fan-output (speed "high"))))
