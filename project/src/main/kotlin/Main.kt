

//if and else or when can be used as an expression or a statement
fun main() {


    println("Hello, World!")
    val someVariable = 0
    println(
        when (someVariable) {
            1 -> "someVariable is 1"
            2 -> "someVariable is 2"
            else -> "someVariable is not 1 or 2"
        }
    )
    when{
        someVariable == 0 -> println("someVariable is 0")
        someVariable > 0 -> println("someVariable is greater than 0")
        else -> println("someVariable is less than 0")
    }
//when with ranges
    when (someVariable) {
        in 1..10 -> println("someVariable is between 1 and 10")
        in 11..20 -> println("someVariable is between 11 and 20")
        else -> println("someVariable is not between 1 and 20")
    }
}