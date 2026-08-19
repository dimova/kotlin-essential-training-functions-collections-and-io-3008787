// Refactor getOutput() to use a when expression
fun getOutput(input: Any?): String = if (input is Number) {
    if (input !is Int) {
        "Input was a non-Int Number"
    } else {
        "Input was an Int"
    }
}
else if (input is String) { "Input was a String with length ${input.length}" }
else if (input == null) { "Input was null" }
else { "Input didn't match target inputs" }

//rewrite the getOutput function using a when expression
fun getOutput2(input: Any?): String {
    return when (input) {
        null -> "Input was null"
        is Int -> "Input was an Int"
        is Number -> "Input was a non-Int Number"
        is String -> "Input was a String with length ${input.length}"
        else -> "Input didn't match target inputs"

    }
}

fun main() {
    println(getOutput(null))
    println(getOutput(4))
    println(getOutput(3.2))
    println(getOutput("Hello Kotlin"))
    println(getOutput('a'))
    println(getOutput2(null))
    println(getOutput2(4))
    println(getOutput2(3.2))
    println(getOutput2("Hello Kotlin"))
    println(getOutput2('a'))
}
