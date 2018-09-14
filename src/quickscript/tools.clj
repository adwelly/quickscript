(ns quickscript.tools
  (:require [quickscript.dict :as dict]))

(defn valid-entry? [k d]
  (let [glyphs (d k)]
    (if glyphs
      (every? #(contains? dict/glyphs %) glyphs)
      false)))

(defn valid-dict? [d]
  (let [entry-keys (keys d)]
    (every? #(valid-entry? % d) entry-keys)))



