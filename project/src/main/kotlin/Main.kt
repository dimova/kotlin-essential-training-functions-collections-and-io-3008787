
fun main() {
    var counter = 0
    while(counter < 5) {
        println("Counter: $counter")
        counter++
        if(counter == 2) break
    }

    do {
        println("Counter in do-while: $counter")
        counter++
    } while(counter < 5)
}