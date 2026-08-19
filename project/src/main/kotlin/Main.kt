
fun main() {
    for (i in 1..10) {
        println("Hello, World! $i")
    }
    for (i in 10 downTo 1) {
        println("Goodbye, World! $i")
    }
    for (i in 0 until 10) {
        println("Counting up: $i")
    }
    for (i in 10 downTo 1 step 2) {
        println("Counting down by 2: $i")
    }
}