

fun main() {
    try {
        val message = "The value is ${10/0}"
    } catch (e: ArithmeticException) {
        println("Caught an exception: ${e.message}")
    }

    //Write try/catch as an expression
    val result = try {
        "The value is ${10/0}"
    } catch (e: ArithmeticException) {
        "Caught an exception: ${e.message}"
    }
    println(result)
}