(ns Main)

(def height 7)
(defn marginWidth [tree trunk]
  (/ (- tree trunk) 2))

(defn trunkWidth [i]
  (+ 1 (* 2 i)))

(defn treeWitdh [height]
  (- (* height 2) 1))

(defn margin [i]
  (reduce str (map (fn [x] " ") (range (marginWidth (treeWitdh height) (trunkWidth i))))))


(defn trunk [i]
  (reduce str (map (fn [x] "*") (range (trunkWidth i)))))

(defn stage [i h]
  (str
    (margin i)
    (trunk i)
    "\n"))

(doseq [i (range height)] (print (stage i height)))