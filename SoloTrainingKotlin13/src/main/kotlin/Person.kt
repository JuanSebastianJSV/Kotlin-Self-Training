class Person(val firstName: String = "Peter", val lastName: String = "Parker"){

    var nickName: String? = null

    // val will get getter generated
    // var will get getter and setter generated

        // function behavior when set is called

        // overriding set
    set(value){
        field = value; // if no field = value, value of nickname will never be updated
            println("Your new nickname is $value")
    }

    // overriding get
    get(){
        println("The returned value is $field")
        return field
    }

    fun printInfo(){
        println("$firstName ($nickName) $lastName")
    }
}