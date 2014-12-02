import us.yellosoft.gruesome.Gruesome

final def isEven = { i -> i % 2 == 0 }

final def genEven = {
  final def i = Gruesome.genInt()

  if (i % 2 as int != 0) {
    i + 1
  }
  else {
    i
  }
}

final def reversible = { s -> s.reverse().reverse() == s }

/* Are all integers even? */
Gruesome.forAll(isEven, [Gruesome.genInt])

/* Are all even integers even? */
Gruesome.forAll(isEven, [genEven])

/* Are all strings reversible? */
Gruesome.forAll(reversible, [Gruesome.genString])
