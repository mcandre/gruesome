import java.util.Random

class Gruesome {
	static def genInt = { new Random().nextInt() }
	static def genBool = { new Random().nextBoolean() }
	static def genByte = { (Gruesome.genInt().abs() % 256) as int }
	static def genChar = { (Gruesome.genByte() % 128) as char }
}