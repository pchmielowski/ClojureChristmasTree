(ns Main)

(defn marginWidth [tree trunk]
  (/ (- tree trunk) 2))

(defn trunkWidth [i]
  (+ 1 (* 2 i)))

(defn treeWitdh [height]
  (- (* height 2) 1))

(defn uniformString [char]
  (fn [size] (reduce str (map (fn [_] char) (range size)))))

(defn margin [i height]
  (apply
    (uniformString " ")
    [(marginWidth
       (treeWitdh height)
       (trunkWidth i))]))

(defn trunk [i]
  (apply
    (uniformString "*")
    [(trunkWidth i)]))

(defn stage [i h]
  (str (margin i h) (trunk i) (margin i h) "\n"))

(defn tree [height]
  (print (reduce str (map (fn [i] (stage i height)) (range height)))))

(tree 15)
