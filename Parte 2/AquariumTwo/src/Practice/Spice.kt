package Practice

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

interface Grinder {
    fun grind()
}

sealed class Spice(
    val name: String,
    val spiciness: String = "mild",
    spiceColor: SpiceColor = YellowSpiceColor
) : SpiceColor by spiceColor {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry(spiciness: String, spiceColor: SpiceColor = YellowSpiceColor) :
    Spice("Curry", spiciness, spiceColor), Grinder {

    override fun prepareSpice() {
        println("Preparando los ingredientes base del curry...")
    }

    override fun grind() {
        println("Moliendo el curry en polvo fino.")
    }
}

fun main() {
    val miCurry = Curry("spicy")
    println("Especia: ${miCurry.name}")
    println("Color (Enum): ${miCurry.color} (RGB: 0x${Integer.toHexString(miCurry.color.rgb).uppercase()})")
}
