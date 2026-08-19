
fun main() {
    val aInt: Int = 10
    val bInt = 0
    val aByte: Byte = 1
    val aShort: Short = 2
    val aLong: Long = 3
    val inferredInt=10
    val inferredLong=300000000000
    val anotherLong=10L
    val unsignedInt: UInt = 4u
    val unsignedLong: ULong = 4uL
    val aDouble: Double = 1.0
    val aFloat: Float= 1.0f
    val inferredDouble = 2.0
    val inferredFloat = 4.0f

    println(5==4)
    println(10f>1)
    println(10.1<=5.2)

    println(10.5.toInt())
    10.9.toFloat()
    5.toULong()

    println(100_000_000.toByte())

}