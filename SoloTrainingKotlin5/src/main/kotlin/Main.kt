// Solo Training Kotlin 5
// Basic Functions

// Function with no Parameter
fun getGreeting(): String? {
    return null
}

fun sayHello(){
    // same as fun sayHello(): Unit
    // Unit is like void
    println(getGreeting())
}

// Single expression function
fun sayHi() = "Hi" //  you can remove the : String because it will always return as a string

fun main(){
    println("Hello World")
    println(getGreeting())
    sayHello()
    print(sayHi())
}