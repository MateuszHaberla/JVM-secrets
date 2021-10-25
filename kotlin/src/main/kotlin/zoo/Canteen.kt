package zoo

import zoo.Exceptions.CanteenFullException
import zoo.Exceptions.NotEnoughResourcesException

const val SIZE = 10

class Canteen(
    private val animals: List<Animal> = listOf()
) {
    
    init {
        if (animals.size > SIZE)
            throw CanteenFullException()
    }
    
    fun feedAll() {
        for (animal in animals) {
            feedSingle(animal)
        }
    }
    
    private fun feedSingle(animal: Animal) {
        if (animal in animals) {
            try {
                Warehouse.decreaseWater()
                Warehouse.decreaseFood()
                animal.feed()
            } catch (e: NotEnoughResourcesException) {
                Warehouse.callDelivery("all")
            }
        }
    }
}