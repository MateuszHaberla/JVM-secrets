package zoo

fun main(args: Array<String>) {
    println(Zoo.INITIAL_LIST)
    Zoo().feedAnimals()
}

class Zoo {
    companion object {
        val INITIAL_LIST = listOf(
            RedPanda("Tony"),
            BlueTiger("Henry")
        )
    }
    
    fun feedAnimals() {
        Canteen(INITIAL_LIST).feedAll()
    }
}