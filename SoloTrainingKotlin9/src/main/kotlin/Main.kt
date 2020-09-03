// Solo Training Kotlin 9
// Mutable and Immutable Collections
// The default collection type in Kotlin is immutable
// you can't add or subtract values from that collection once it is initially created

fun sayHello(greeting: String, itemsToGreet:List<String>){

    // say greetings to List
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main(){
    // Immutable List
    println("Immutable List")
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings)
    println()

    // Mutable List
    println("Mutable List")
    val interestingThings2 = mutableListOf("Kotlin", "Programming", "Comic Books")
    interestingThings2.add("Dogs")
    interestingThings2.removeAt(1)
    println(interestingThings2)
    println()

    // Immutable Map
    println("Immutable Map")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value ->
        println("$key -> $value")
    }
    println()

    // Mutable Map
    println("Mutable Map")
    val map2 = mutableMapOf(1 to "Apple", 2 to "Banana", 3 to "Cherry")
    map2.put(4,"Dragonfruit")
    map2.forEach { key2, value2 ->
        println("$key2 -> $value2")

    }
    println()

    sayHello("Hi",interestingThings)

}