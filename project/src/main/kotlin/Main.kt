

fun getMessage(input: Int): String {
    return if (input > 0) {
        "Positive"
    } else if (input < 0) {
        "Negative"
    } else {
        "Zero"
    }
}
//make it a single expression function
fun getMessageSingleExpression(input: Int): String = if (input > 0) {
    "Positive"
} else if (input < 0) {
    "Negative"
} else {
    "Zero"
}

//write a when expression function that takes an integer and returns a string indicating whether the number is even or odd
fun getEvenOddMessage(input: Int): String {
    return when (input % 2) {
        0 -> "Even"
        1, -1 -> "Odd"
        else -> "Unknown"
    }
}

//write a when single expression function that takes an integer and returns a string indicating whether the number is even or odd
fun getEvenOddMessageSingleExpression(input: Int): String = when (input % 2
) {
    0 -> "Even"
    1, -1 -> "Odd"
    else -> "Unknown"
}

fun main() {
    //if statement vs if expression
    val number = 10
    //if statement
    if (number > 0) {
        println("$number is positive")
    } else {
        println("$number is not positive")
    }
    //if expression
    val result = if (number > 0) {
        "$number is positive"
    } else {
        "$number is not positive"
    }
    println(result)
}