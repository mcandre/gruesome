#!/usr/bin/env groovy

import java.util.Random

def isEven = { i -> i % 2 == 0 }

def genEven = {
	def i = Gruesome.genInt()

	if (i % 2 as int != 0) {
		i + 1
	}
	else {
		i
	}
}

Gruesome.forAll(isEven, [Gruesome.genInt])
Gruesome.forAll(isEven, [genEven])