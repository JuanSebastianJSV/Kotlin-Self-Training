// Solo Training Kotlin 24
// Kotlin Standard Library

fun main(){
    val list = listOf("Kotlin", "Java", "C++", "Javascript",null,null)
     val map =  list  .filterNotNull() // filter nulls and only show not null values
    .associate { it to it.length } // iterating over map entries of string and int
        //      .take(3) // take the first n collections
//        .filter{
//        it.startsWith("J")
//    }
//        .map{
//            it.length // change string to integer
//        }
//
    val language = list.first() // first value
    println(language)

    val language2 = list.last() // last value
    println(language2)

    val language3 = list.filterNotNull().last() // last non null value
    println(language3)

    val language4 = list.filterNotNull().find{it.startsWith("Java")} // find Java
    println(language4)

    val language5 = list.filterNotNull().findLast{it.startsWith("Java")} // find Javascript
    println(language5)

    val language6 = list.filterNotNull().findLast{it.startsWith("foo")} // find foo
    println(language6)

    val language7 = list.filterNotNull().findLast{it.startsWith("foo")}.orEmpty()// find foo if empty return empty string
    println(language7)

}