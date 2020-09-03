// Solo Training Kotlin 3
// Type System

// Top-Level Variables
val name: String = "Nate" // val values cannot be reassigned
var greeting = "Hello" // var values can be reassigned
// if you remove the : String it will also work

// Types are not null by default in Kotlin
// How to make a Nullable string?
var name2: String? = "Jas" // ? makes the string nullable or you can assign with an actual value

fun main(){
    println("Before Nullification")
    println(name)
    println(name2)
    println(greeting)

    name2 = null

    println("After Nullification")
    println(name)
    println(name2)
    println(greeting)
}