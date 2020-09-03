// Solo Training Kotlin 7
// Collection (Array, list, etc) and Iteration

fun sayHello(greeting: String, itemToGreet: String) = "$greeting $itemToGreet"

fun main(){
    // Array
    val interestingThings = arrayOf("Kotlin","Programming","Comic Books") // this is an array of Strings

    // It has some functions, such as size, [] (index of array), etc
    println(interestingThings.size) // printing out the size of the array
    println(interestingThings[2]) // printing out the third index of the array
    println(interestingThings.get(1)) // printing out the second index of the array

    // For Loop
    var i: Int = 0
    println("For Loop")
    for(interestingThing in interestingThings){
        // its the same as for(int i in interestingThings), interestingThing is a new variable
        println("Index[$i] = $interestingThing")
        i++
        println()
    }

    // For Each Loop
    println("For Each Loop")
    // implementation of Lambda Synthax
    // if you have a function and its only parameter is another function, you can omit the parenthese all together
    // and you can pass that function in by specifying it open and closed parentheses

    interestingThings.forEach {interestingThing -> // it can be renamed
    println(interestingThing) // it is the default name for each index of array that is passed
        println()
    }

    // For Each Indexed
    println("For Each Loop Indexed")
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
    
}