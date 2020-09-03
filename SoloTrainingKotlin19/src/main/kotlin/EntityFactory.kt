interface IdProvider{
    fun getId(): String
}

// Object Declaration
object EntityFactory{
    fun create() = Entity("id","name")
}

// class Entity private constructor(val id: String){
class Entity (val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name: $name"
    }
    // Companion Object
    // is an object scoped to an instance of another class
    //companion object factory : IdProvider {
       // companion object factory{
      //  override fun getId(): String {
        //    return "123"
        //}

        //const val id = "id"
        //fun create() = Entity("id")
    // }
}

    fun main(){
        //val entity = Entity.create()
        val entity = EntityFactory.create()
        // val entity = Entity.Companion.create()
        // if it has a name ex: factory
        // val entity = Entity.factory.create()
        // companion object has access to private classes or constructors
    //    Entity.id
        println(entity)
    }
