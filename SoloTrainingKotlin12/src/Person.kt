// assigning the values of firstName and lastName directly

// Primary Constructor
class Person(val firstName: String,val lastName: String){
    // can be declared as
    // class Person(val firstName: String = "Peter", val lastName: String = "Parker")
    // is the same as class Person constructor()

    // properties of person class
    init{
        println("init 1")
    }
    // Secondary Constructors
    constructor(): this("Peter","Parker"){
        println("Secondary Constructor")
    }

    // init blocks will always run before the secondary constructor
    init{
        println("init 2")
    }

}