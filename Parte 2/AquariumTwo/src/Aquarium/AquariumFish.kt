package Aquarium

abstract class AquariumFish1 {
    abstract val color: String
}

class Shark: AquariumFish1(), FishAction1 {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus1: AquariumFish1(), FishAction1 {
    override val color = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

interface FishAction1 {
    fun eat()
}