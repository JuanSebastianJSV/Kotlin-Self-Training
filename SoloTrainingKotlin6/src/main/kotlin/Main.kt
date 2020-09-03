// Solo Training Kotlin 6
// Function Parameters

// Function with one parameter
fun sayHello(itemToGreet: String){
    // it can be same as String itemToGreet but in kotlin we use (variable_name : datatype)
    val msg = "Hello " + itemToGreet // string template to substitute in variable values or argument into a predefined string temple
    val msg2 = "Hello $itemToGreet" // you can use this in order not to concat the itemToGreet
    println(msg)
    println(msg2)
}

fun sayGoodbye(message: String) = "Goodbye $message"

// Function with Two Parameters
fun sayMerci(merci: String, name: String){
    val msg3 =  merci + " " + name // Concat
    val msg4 = "$merci $name"
    println(msg3)
    println(msg4)
}

fun sayDanke(danke: String, name: String) = "$danke $name"
fun sayGracias (gracias: String,name: String) = gracias+name
fun main(){
    sayHello("Jsv")
    sayHello("World")
    println(sayGoodbye("Jsv"))
    println(sayGoodbye("World"))
    sayMerci("Merci","Jsv")
    println(sayDanke("Danke", "Jsv"))
    println(sayGracias("Gracias ", "Jsv"))
}