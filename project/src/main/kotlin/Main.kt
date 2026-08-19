// a function that prints "Hello World" to the console
fun main() {
    println("Hello World")
    greet("Alice")
    println(getGreeting("Bob"))
}
//returns unit but not necessarily required to specify it
fun greet(name: String): Unit {
    println("Hello, $name!")
}

fun getGreeting(name: String): String {
    return "Hello, $name!"
}

//single expression function
fun getFarewell(name: String): String = "Goodbye, $name!"

//local function
fun mainWithLocalFunction() {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}
//functions are public by default, but can be marked as private or internal.
//internal only visible within the same module