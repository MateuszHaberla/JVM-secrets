package zoo

data class BlueTiger(
    override val name: String,
) : Animal {
    override val specie: Specie = Specie.BLUE_TIGER
    override var isHungry: Boolean = false
}
