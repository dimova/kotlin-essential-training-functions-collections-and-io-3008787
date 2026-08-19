
//higher order function that takes two integers and a lambda function as parameters
fun printCalculatedValues(value1: Int, value2: Int, operation: (Int, Int) -> Int) {
    val result = operation(value1, value2)
    println("The result of the operation is: $result")

}
//trailing lambda syntax is used to pass the lambda function as the last parameter
fun main() {
    printCalculatedValues(10, 5) { a, b -> a + b } // Addition
    printCalculatedValues(10, 5) { a, b -> a - b } // Subtraction
    printCalculatedValues(10, 5) { a, b -> a * b } // Multiplication
    printCalculatedValues(10, 5) { a, b -> a / b } // Division
}