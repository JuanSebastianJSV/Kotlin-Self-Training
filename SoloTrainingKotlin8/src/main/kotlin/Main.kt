// Solo Training Kotlin 8

// List and Map
fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main(){

    // List

    val interestingThings = listOf("Kotlin","Programming","Comic Books")
    interestingThings.forEach { interestingThing ->
        println(interestingThing)

    }

    // Map

    // you can define maps as pairs like so:
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    // DEFINE A MAP with 3 pairs of values in it
    // the keys are 1,2,3 and the values are a,b,c
    // the keys can only be numbers

    map.forEach { key, value ->
        println("$key: $value")
    }

    
}