
fun main() {
    val languages = listOf("Kotlin", "Java", "Python", "C++", "JavaScript")
        .filter { it.length > 4 }
        .map{ it.uppercase() }
    val languageSequence = languages.asSequence()
        .filter { it.startsWith("J") }
        .map { it.reversed() }
    val languageSequence2 = sequenceOf("Kotlin", "Java", "Python", "C++", "JavaScript")
        .filter { it.length > 4 }
        .map { it.uppercase() }
        .filter { it.startsWith("J") }
        .map { it.reversed() }
    println(languageSequence2.toList())
}