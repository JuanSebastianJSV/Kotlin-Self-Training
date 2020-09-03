// Solo Training Kotlin 4
// Basic Control Flow (If / Else)
// There are two basic control Flows in Kotlin
// 1. If - else
// 2. When (similar to Switch - case)

val name = "Nate"
var greeting: String? = null

fun main(){
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    val greetingToPrintTwo = when (greeting){
        null -> "Hi"
        else -> greeting
    }
    // you can assign a control flow to a val
    // if greeting is not null, print the greeting
    // if the greeting is null, print "Hi"

    //greeting = "Hello"
    // If - else
    if(greeting != null) {
        println(greeting)
    }
    else{
        println("Hi")
    }
    println(name)

    // When
    when(greeting){
        null -> println("Hi")
        // -> can be read as then
        // if the greeting is null, then print "Hi"

        else -> println(greeting)
        // can be read as then
        // if the greeting is not null, then print the greeting
    }

    println(greetingToPrint)
    println(greetingToPrintTwo)

}