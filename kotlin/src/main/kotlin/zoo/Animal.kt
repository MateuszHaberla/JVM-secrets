package zoo

interface Animal {
    val specie: Specie
    val name: String
    var isHungry: Boolean
    
    fun feed() {
        isHungry = false
    }
}