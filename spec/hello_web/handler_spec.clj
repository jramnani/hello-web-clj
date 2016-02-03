(ns hello-web.handler-spec
  (:require [speclj.core :refer :all]
            [hello-web.handler :refer :all]))

(describe "Truth"

  (it "is true"
    (should true))

  (it "is not false"
    (should-not false)))


(run-specs)
