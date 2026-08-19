
var greetingFunction: (String) -> String = { name -> "Hello, $name!" }

var greetingFunction2: ()->Unit = { println("Hello, World!") }

var greetingFunction3: (String)->String = { "Hello, $it" }

fun main() {
    val name = "World"
    println(greetingFunction(name))
    greetingFunction2()
    greetingFunction2 = { println("Hello, Kotlin!") }
    greetingFunction2.invoke()
    println(greetingFunction3("Kotlin"))
    println(greetingFunction3("World"))
    println(greetingFunction3.invoke("Everyone"))
}