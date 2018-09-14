(ns quickscript.core-test
  (:require [midje.sweet :refer :all]
            [midje.util :refer [testable-privates]]
            [quickscript.core :refer :all]
            [quickscript.tools :refer :all]
            [quickscript.dict :as dict]))

(def bad-dict
  {"wibble" [:when :idiot :bat :bay :low]})

(fact "valid-entry returns true if all glyphs for an entry in the dict are real glyphs"
      (valid-entry? "about" dict/basic100) => true
      (valid-entry? "wibble" bad-dict) => false)



