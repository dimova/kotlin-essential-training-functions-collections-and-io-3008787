
private fun printGreeting() = println("Hello Kotlin")

fun main() {
    //function with default parameter
    fun getGreeting(
        greeting: String,
        thingToGreet: String = "World"
    ) = "$greeting, $thingToGreet"

    //named argument
    println(getGreeting("Hello", thingToGreet = "Kotlin"))
}