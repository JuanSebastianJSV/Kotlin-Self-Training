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

interface SessionInfoProvider{
    fun getSessionID(): String
}

// Abstract Class
//abstract class BasicInfoProvider: PersonInfoProvider

// implement both interfaces
// use open keyword to enable inheritance from or to this class
open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{

    override val providerInfo: String
        get() = "BasicinfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionID(): String {
        return sessionIdPrefix
    }
}


fun main(){
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    provider.getSessionID()

    checkTypes(provider)
}

// Type Checking
fun checkTypes(infoProvider: PersonInfoProvider){
    // check if personInfoProvider is also an instance of Session Info Provider
    if(infoProvider is SessionInfoProvider){
        println("is a Session Info Provider")

        // Type Casting
        (infoProvider as SessionInfoProvider).getSessionID() // as is used to Typecast (Smart casting)
        infoProvider.getSessionID()  // dont need to explicitly cast it each time
    }
    else{
        println("not a Session Info Provider")
    }
}