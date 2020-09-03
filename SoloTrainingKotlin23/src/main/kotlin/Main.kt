// Solo Training Kotlin 23
// Higher Order Functions

// are functions that either returns another function or takes function as parameter value

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){
    // predicate is a function that takes string as parameter and returns a boolean
    list.forEach {
        if(predicate?. invoke(it) == true){
            println(it)
        }
    }
}
val predicate: (String) -> Boolean = {
    it.startsWith("K")
}

fun getPrintPredicate(): (String) -> Boolean {
    return{
        it.startsWith("K")
    }
}

fun main(){
    val list = listOf("Kotlin", "Java", "C++", "JavaScript")
    printFilteredStrings(list,getPrintPredicate())
    printFilteredStrings(list,null)
}