#!/usr/bin/env groovy

import java.util.Random

def isEven = { i -> i % 2 == 0 }

Gruesome.forAll(isEven, [Gruesome.genInt])