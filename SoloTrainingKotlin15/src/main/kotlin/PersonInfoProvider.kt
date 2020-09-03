interface PersonInfoProvider{
    // Property in Interface
    val providerInfo: String

    // it can be empty, for example interface PersonInfoProvider
    fun printInfo(person: Person){
        // define the behavior of the interface
        println(providerInfo) // encapsulating the logic in the interface itself
        person.printInfo()
    }
}

// Abstract Class
//abstract class BasicInfoProvider: PersonInfoProvider
 class BasicInfoProvider: PersonInfoProvider{

    override val providerInfo: String
        get() = "BasicinfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }
}


fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
}