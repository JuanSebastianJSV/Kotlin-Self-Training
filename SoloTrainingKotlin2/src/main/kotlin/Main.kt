// Solo Training Kotlin 2
// Variables

var name3 = "Sebastian" // Top-levels variables : variables that are declared outside the main function
var greeting = "Goodnight"

fun main(){
    // Two Types of variables in kotlin:
    // 1. Mutable Variables, which can have their values reassigned
    // Declared using var keyword
    var name2: String = "Juan"

    name2 = "Jsv"


    // 2. Local Read-Only Variables, which can be assigned only once
    // Declared using val keyword

    val name: String = "Nate"
    // val -> local read-only variable
    // name -> name of the variable
    // : -> datatype assign
    // String -> datatype
    // = -> assignment operator
    // "Nate" the value

    // if you try to reassign a val it will cause an error.
    println(name)
    println(name2)
    println(name3)
    println(greeting)
}