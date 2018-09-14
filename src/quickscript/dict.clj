(ns quickscript.dict)

(def glyphs #{:pea :bay :tea :day :key :gay :thaw :they :fee :vie
              :see :zoo :she :jai :cheer :jay :ye :way :he :why
              :ing :may :no :low :roe
              :it :eat :et :eight :at :i :ah :awe :ox :oy
              :utter :out :owe :foot :ooze
              :llan :loch :tallx :shortx :utter-alt :no-alt})

(def basic103
  {"a" [:utter]
   "about" [:utter :bay :out :tea]
   "all" [:awe :low]
   "also" [:awe :low :see]
   "and" [:no]
   "as" [:ah]

   "be" [:bay]
   "been" [:bay :no]
   "being" [:bay :ing]
   "because" [:bay :key :zoo]
   "but" [:bay :tea]
   "by" [:bay :i]

   "can" [:key]
   "come" [:key :may]
   "could" [:key :day]

   "day" [:day :eight]
   "do" [:day]
   "did" [:day :it :day]

   "even" [:eat :vie :et :no]

   "find" [:fee :i :no :day]
   "first" [:fee :et :roe :see :tea]
   "for" [:fee]
   "from" [:fee :may]

   "get" [:gay :et :tea]
   "give" [:gay :it :vie]
   "go" [:gay :owe]

   "have" [:he :vie]
   "he" [:he]
   "her" [:he :utter :roe]
   "here" [:he :eat :roe]
   "him" [:he :may]
   "his" [:he :zoo]
   "how" [:he :out]

   "i" [:i]
   "if" [:it :fee]
   "in" [:it :no]
   "into" [:it :no :tea]
   "it" [:it]
   "its" [:it :see]
   "it's" [:it :see]
   "is" [:zoo]

   "just" [:jay :utter :see :tea]

   "know" [:no :owe]

   "like" [:low :i :key]
   "look" [:low :ooze :key]

   "make" [:may :key]
   "man" [:may :at :no]
   "many" [:may :et :no :it]
   "me" [:may]
   "more" [:may :awe :roe]
   "my" [:may :i]

   "new" [:no :ye :foot]
   "no" [:no :owe]
   "not" [:no :ox :tea]
   "now" [:no :out]

   "of" [:vie]
   "on" [:ox :no]
   "one" [:way :utter :no]
   "only" [:ox :no :low]
   "or" [:ox :roe]
   "other" [:utter :the :utter :roe]
   "our" [:out :roe]
   "out" [:out :tea]

   "people" [:pea :pea :low]

   "say" [:see :eight]
   "see" [:see :eat]
   "she" [:she]
   "so" [:see]
   "some" [:see :utter :may]

   "take" [:tea :eight :kay]
   "tell" [:tea :et :low]
   "than" [:they :at :no]
   "that" [:they :at :tea]
   "the" [:they]
   "their" [:they :eight :roe]
   "them" [:they :et :may]
   "then" [:they :et :no]
   "there" [:they :et :roe]
   "these" [:they :zoo]
   "they" [:they :eight]
   "this" [:they :see]
   "those" [:they :ox :zoo]
   "time" [:tea :i :may]
   "to" [:tea]
   "two" [:tea :ooze]

   "up" [:utter :pea]
   "use" [:ye :utter :zoo]

   "very" [:vie :roe]
   })

;want
;way
;we
;well
;what
;when
;which
;who
;will
;with
;would
;year
;you
;your