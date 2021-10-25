package zoo

data class RedPanda(
    override val name: String,
) : Animal {
    override val specie: Specie = Specie.RED_PANDA
    override var isHungry: Boolean = false
}
