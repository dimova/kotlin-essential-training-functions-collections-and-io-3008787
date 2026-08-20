import org.intellij.lang.annotations.Language

fun main() {
    val languages: Set<String> = setOf("Kotlin", "Java", "Python", "JavaScript")
    for(language in languages) {
        println("I love $language!")
    }
    val n = languages.size
    println("I love $n programming languages!")
    val mutableLanguages = languages.toMutableSet()
    mutableLanguages.add("Java")
    mutableLanguages.add("Python")

    //immutable map
    val testScores: Map<String, Int> = mapOf("Alice" to 90, "Bob" to 85, "Charlie" to 95)
    val testScores2: Map<String, Int> = mapOf(Pair("Alice", 90), Pair("Bob", 85), Pair("Charlie", 95))
    println(testScores["Alice"]) // prints 90
    for(result in testScores) {
        println("${result.key} scored ${result.value}")
    }
    for((name, score) in testScores) {
        println("$name scored $score")
    }
    testScores.contains("Alice") // returns true
    testScores.containsValue(90) // returns true
    testScores.keys.forEach {println(it)}
    testScores.values.forEach {println(it)}
    val mutableTestScores = testScores.toMutableMap()
    mutableTestScores["David"] = 80
    mutableTestScores.forEach { name, score -> println("$name scored $score") }


}