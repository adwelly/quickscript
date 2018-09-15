(ns quickscript.core-test
  (:require [midje.sweet :refer :all]
            [midje.util :refer [testable-privates]]
            [quickscript.core :refer :all]
            [quickscript.tools :refer :all]
            [quickscript.dict :as dict]))

(def bad-dict
  {"wibble" [:when :idiot :bat :bay :low]})

(fact "valid-entry returns true if all glyphs for an entry in the dict are real glyphs"
      (valid-entry? "about" dict/basic103 false) => true
      (valid-entry? "wibble" bad-dict false) => false)

(fact "a string of words recocgnised in a dictionary will be converted to maps of glyphs"
      (str-to-glyphs "You will be with them" dict/basic103) => [[:ye :ooze] [:low] [:bay] [:way :it] [:they :et :may]])

(fact "a string of words containing unrecognised words will leave those words unchanged"
      (str-to-glyphs "you will be like us!" dict/basic103) => [[:ye :ooze] [:low] [:bay] [:low :i :key] "us" "!"])

