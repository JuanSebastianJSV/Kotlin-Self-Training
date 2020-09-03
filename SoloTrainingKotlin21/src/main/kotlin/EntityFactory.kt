import java.util.*

enum class EntityType {
   HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory{
    fun create(type: EntityType): Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY ->Entity.Easy(id, name)
            EntityType.MEDIUM ->Entity.Medium(id, name)
            EntityType.HARD ->Entity.Hard(id, name,.2f)
            EntityType.HELP -> Entity.help
        }
    }
}

// Sealed Class
sealed class Entity(){

    // Object declaration
    object help: Entity(){
        val name = "Help"
    }

    // you can have different properties and methods with sealed

    // Data Classes
   data class Easy(val id: String, val name: String): Entity(){
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun main(){
//    val entity : Entity = EntityFactory.create(EntityType.HELP)
//    val msg = when(entity){
//        Entity.help -> "Help Class"
//        is Entity.Easy -> "Easy Class"
//        is Entity.Medium -> "Medium Class"
//        is Entity.Hard -> "Hard Class"
//    }
//    println(msg)

    val entity1 = Entity.Easy("id","name")
    val entity2 = Entity.Easy("id","name")
    // val entity2 = entity1.copy()
    // val entity2 = entity1.copy(name = "new name")

    // === will also check the reference if they are equal or not
    if(entity1 === entity2){
        println("they are equal")
    }
    else{
        println("they are not equal")
    }
}
