(ns quickscript.tools
  (:require [quickscript.dict :as dict]
            [clojure.string :as str]))

(defn valid-entry? [k d verbose?]
  (let [glyphs (d k)]
    (if glyphs
      (if (every? #(contains? dict/glyphs %) glyphs)
        true
        (do
          (when verbose? (println k "has" glyphs))
          false)))))


(defn valid-dict?
  ([d] (valid-dict? d false))
  ([d verbose?]
   (let [entry-keys (keys d)]
     (every? #(valid-entry? % d verbose?) entry-keys))))

(defn str-to-glyphs [s d]
  (let [words (str/split s #"\s|(?=!)|(?=,)|(?=\.)")]
    (for [w words :let [lc (str/lower-case w) glyphs (d lc)]]
      (if glyphs glyphs w))))




