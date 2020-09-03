class FancyInfoProvider : BasicInfoProvider(){
    // inheriting BasicInfoProvider to FancyInfoProvider
    // By default in kotlin, a class cannot be inherited from or inherited to another class
    // use open keyword to inherit

    // overriding provider info

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }
}