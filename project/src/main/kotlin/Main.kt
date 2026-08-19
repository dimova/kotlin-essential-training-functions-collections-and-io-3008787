
@OptIn(ExperimentalUnsignedTypes::class)
fun main() {
    val ints = arrayOf(1,2,3,4,5)
    val int2 = arrayOf(1,2,3,4,null)
    val nulls = arrayOfNulls<Int?>(ints.size)
    val custom = Array(ints.size) {
        index -> ints[index]
    }
    println(custom.joinToString())
    val firstValue = ints.get(0)
    ints.set(0, 99)
    val first = ints[0]
    ints[0] = 100

    //array of primitive ints
    val primitiveInts = intArrayOf(1,2,3,4,5)
    //array of unsigned shorts
    val unsignedShorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)
    //array of unsigned ints
    val unsignedInts = uintArrayOf(1u, 2u, 3u, 4u, 5u)
    //array of unsigned longs
    val unsignedLongs = ulongArrayOf(1uL, 2uL, 3uL, 4uL, 5uL)
    //array of unsigned bytes
    val unsignedBytes = ubyteArrayOf(1u, 2u, 3u, 4u, 5u)

    for (int in ints) {
        println(int)
    }
    for (int in 0 until ints.size) {
        println(ints[int])
    }

    ints.forEach { println(it) }
    ints.forEach { element -> println(element) }
    greetThing("Alice", "Book", "Pen", "Notebook")
}

fun greetThing(name: String, vararg items: Any) {
    for (item in items) {
        println("Hello, $name! Here is your item: $item")
    }

}