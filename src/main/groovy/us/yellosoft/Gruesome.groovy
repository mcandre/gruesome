package us.yellosoft.gruesome

import java.util.Random

class Gruesome {
    static final def VERSION = "0.0.1"

    static final def genInt = { new Random().nextInt() }
    static final def genBool = { new Random().nextBoolean() }
    static final def genByte = { (Gruesome.genInt().abs() % 256) as int }
    static final def genChar = { (Gruesome.genByte() % 128) as char }

    static final def genArray = { final g ->
        def len = Gruesome.genInt().abs() % 100
        (0 .. len).collect { i -> g() }
    }

    static final def genString = { Gruesome.genArray(Gruesome.genChar).join("") }

    static final apply(final clos, final args) {
        final def c = clos
        args.each { final a -> c = c.curry(a) }

        c()
    }

    static final forAll(final property, final generators) {
        final def testCases = (0 .. 99).collect { final i -> generators.collect({ g -> g() }) }
        final def failures = testCases.findAll { final testCase -> !apply(property, testCase) }

        if (failures.size > 0) {
            println "*** Failed!"
            println failures[0]

            false
        }
        else {
            println "+++ OK, passed 100 tests."

            true
        }
    }
}
