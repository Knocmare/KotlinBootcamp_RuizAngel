package Aquarium

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces() // true
}

class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull() // ok
}
