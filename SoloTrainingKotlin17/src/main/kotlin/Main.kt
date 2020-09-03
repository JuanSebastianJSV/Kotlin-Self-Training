// Solo Training Kotlin 17
// Type checking and Type Casting

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