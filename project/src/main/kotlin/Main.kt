
fun main() {
    // Using the provided test scores, identify the 3 students
    // with the lowest test scores
    testScores
        .entries
        .sortedBy { it.value }
        .take(3)
        .forEach { (studentId, score) ->
            println("$studentId: $score")
        }
}