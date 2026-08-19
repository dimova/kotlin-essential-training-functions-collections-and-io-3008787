
fun checkType(input:Any?){
    //smart casting
    if(input == null){
        println("Input is null")
        return
    }

    if(input is String){
        println("Input is a String with length ${input.length}")
    }else if(input is Int){
        println("Input is an Int")
    }else{
        println("Input is of unknown type")
    }
}

fun checkTypeWithWhen(input:Any?){
    when(input){
        null -> println("Input is null")
        is String -> println("Input is a String with length ${input.length}")
        is Int -> println("Input is an Int")
        else -> println("Input is of unknown type")
    }
}


fun main() {
    val aGenericVariable: Any =5
    val anInt: Int=aGenericVariable as Int
    val aGenericVariable2: Any = "Hello"
    val anInt2: Int? = aGenericVariable2 as? Int
    checkType(aGenericVariable)
    checkType(aGenericVariable2)
}