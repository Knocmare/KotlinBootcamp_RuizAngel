package Practice

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

fun main() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("mild")),
        SpiceContainer(Curry("medium")),
        SpiceContainer(Curry("spicy"))
    )

    println("--- Etiquetas de los contenedores de especias ---")

    for (container in spiceCabinet) {
        println("Etiqueta: ${container.label}")
    }
}
