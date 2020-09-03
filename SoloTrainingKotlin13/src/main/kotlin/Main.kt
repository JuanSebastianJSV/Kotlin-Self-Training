// Solo Training Kotlin 13
// Properties with Getters / Setters

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach{itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main(){
    val person = Person()
    person.lastName
    person.firstName
    person.nickName = "Jsv" // can assign nickname because it is  var
    person.nickName = "New Nickname"
    println(person.nickName)
}