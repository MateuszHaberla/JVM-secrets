package zoo

import zoo.Exceptions.NotEnoughResourcesException

object Warehouse {
    private var food: Int = 0
    private var water: Int = 0
    
    fun decreaseFood() {
        if (food > 0)
            food -= 1
        else throw NotEnoughResourcesException()
    }
    
    fun decreaseWater() {
        if (food > 0)
            water -= 1
        else throw NotEnoughResourcesException()
    }
    
    fun callDelivery(type: String) {
        when (type) {
            "water" -> water += 100
            "food" -> food += 100
            "all" -> {
                water += 100
                food += 100
            }
        }
    }
}