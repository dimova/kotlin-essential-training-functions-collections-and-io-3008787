
fun main() {
    val aChar: Char = 'A'
    val aNumericChar: Char = '1'
    val newLineChar: Char = '\n'

    val aString: String = "Hello, Kotlin!"
    val escaped = "Hello, \"Kotlin\"!\nThis is a new line."
    val rawString = """This is a raw string.
It can span multiple lines and include "quotes" without escaping."""
    println(rawString)
    val concatStrings = aString + " " + escaped
    val concatNumber = 42.toString() + " is the answer to life, the universe, and everything."
    val concatNumber1 = "The number is: " + 42
    val aNumber = 10
    val concatTemplate = "The number is: $aNumber"//string template
    val expressionTemplate = "The expression is: ${aNumber * 2}"
    val hello = "Hello, Kotlin!"
    println(hello.isEmpty())
    println(hello.contains("Hello, Kotlin!"))
    println(hello.isNotEmpty())
    println(hello.isNotBlank())

}