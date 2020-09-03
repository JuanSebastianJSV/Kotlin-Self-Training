// Solo Training Kotlin 12
// Classes

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello(itemsToGreet = *interestingThings, greeting = "Hi")

    val person = Person("Luis","Sebstian") // how to create a new instance from Person class
    // property access synthax
    val person2 = Person()
    person.lastName
    person.firstName
    person2.lastName
    person2.firstName
}