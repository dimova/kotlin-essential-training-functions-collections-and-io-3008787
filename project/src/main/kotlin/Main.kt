
fun main() {
    val readOnlyList = listOf(1,2,3,4,5)
    val readOnlySet = setOf(1,2,3,4,5)
    val readOnlyMap = mapOf(1 to 1, 2 to 2, 3 to 3, 4 to 4, 5 to 5)

    val mutableList = mutableListOf(1,2,3,4,5)
    val mutableSet = mutableSetOf(1,2,3,4,5)
    val mutableMap = mutableMapOf(1 to 1, 2 to 2, 3 to 3, 4 to 4, 5 to 5)

    mutableList.size
    readOnlyMap.size

    mutableSet.isEmpty()
    readOnlyList.isNotEmpty()
    for(element in readOnlyList) {
        println(element)
    }
    mutableMap.forEach() { key, value ->
        println("$key -> $value")
    }

    readOnlyList.first()
    mutableSet.first()
    mutableList.take(3)
    readOnlySet.take(2)
    mutableMap.filter{entry -> entry.value > 2 }
    readOnlyList.filter { it > 1 }

    val languages = mapOf(
        "Java" to 1995,
        "Kotlin" to 2011,
        "Python" to 1991,
        "JavaScript" to 1995
    )
    languages.filter{entry -> entry.value > 1995}
    languages.map { it.key }.sorted().forEach{println(it)}
}