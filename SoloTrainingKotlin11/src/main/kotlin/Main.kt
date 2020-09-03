// Solo Training Java 11
// Named Arguments

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach{ itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main(){
    // Named Arguments
    greetPerson(greeting = "hi", name = "Luis")

    // allows us to mix up the order of the arguments.
    // for example: greetPerson(name = "Luis", greeting = "hi)

    // it must take both argument even if it can mix up the order
    greetPerson(name = "Juan", greeting = "Jancok")

    // default value
    greetPerson()

    val interestingThings = arrayOf("Kotlin","Programming","Comic Books")
    fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

    // Print hi from array interesting things
    sayHello(greeting = "hi", *interestingThings)

    // Mixed Up
    sayHello(itemsToGreet = *interestingThings, greeting = "hi")
}
