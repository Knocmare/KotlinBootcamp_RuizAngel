package Practice

class SimpleSpice(
    var name: String = "curry",
    var spiciness: String = "mild"
) {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                else -> 0
            }
        }
}

fun main() {
    val mySpice = SimpleSpice()

    println("Especia: ${mySpice.name}")
    println("Nivel de picor (Heat): ${mySpice.heat}")
}