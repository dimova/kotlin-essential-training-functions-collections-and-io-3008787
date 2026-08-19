
fun main() {
//null and non-null data types
    var name: String? = null // nullable type
    //?: is the Elvis operator, it returns the left-hand side if it's not null, otherwise it returns the right-hand side
    println(name?.length ?: "Name is null") // prints "Name is null"
    var age: Int = 25 // non-nullable type

    // safe call operator
    println(name?.length) // prints null

    // Elvis operator
    val length = name?.length ?: 0 // if name is null, length will be 0
    println(length) // prints 0

    // not-null assertion operator
    try {
        println(name!!.length) // throws NullPointerException
    } catch (e: NullPointerException) {
        println("Caught NullPointerException")
    }
}