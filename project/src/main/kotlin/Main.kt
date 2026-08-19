

// write a function that satisfies the following requirements

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun main() {
    val firstName = "John"
    val lastName = "Doe"

    // Example formatting function
    val formatFunction: (String, String) -> String = { first, last -> "$first $last" }

    printFormattedName(firstName, lastName, formatFunction)

    val fancyFormatFunction: (String, String) -> String = { first, last -> "Mr. $first $last" }
    printFormattedName(firstName, lastName, fancyFormatFunction)

    printFormattedName(firstName, lastName) { first, last -> "$last, $first" }
}

fun printFormattedName(firstName: String, lastName: String, format: (String, String) -> String) {
    val result = format(firstName, lastName)
    println(result)
}