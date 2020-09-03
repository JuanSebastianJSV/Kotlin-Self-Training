// Solo Training Kotlin 21
// Sealed Classes and Data Classes

fun sayHello(greeting:String, vararg itemsToGreet: String){
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main(){
    val person = Person()
    person.printInfo()
    person.nickName
}