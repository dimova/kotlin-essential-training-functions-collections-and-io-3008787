
fun main() {
    val stringList: List<String> = listOf("Book", "Pen", "Notebook")
    val listOfInts: List<Int> = listOf(1, 2, 3, 4, 5)
    val doubledValues: List<Int> = listOfInts.map { it * 2 }
    doubledValues.forEach { println(it) }
    val doubledValues2: List<Int> = List(5) { it * 2 }
    doubledValues2.forEach { println(it) }
    val languages = mutableListOf(
            "Kotlin", "Java", "Python")
    languages.add("Vue")
    languages[1] = "JavaScript"
    languages.remove("Python")
        //mutableListOf extends List, so you can use all the methods of List
}