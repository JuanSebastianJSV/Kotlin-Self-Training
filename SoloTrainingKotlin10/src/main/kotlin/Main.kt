// Solo Training Java 10
// Varargs (Variable Arguments)

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// Vararg Parameter
// Represents variable number of Arguments
fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Wibu")

    // Vararg will be treated as an array to whatever is specified.
    // if we dont pass any items after the greeting, it will be treated as an empty array.

    sayHello("Hi","Kotlin","Programming","Wibu","Kontol")

    // Spread operator (*)
    // putting an asterisk before a variable
    sayHello("Hi", *interestingThings)
}