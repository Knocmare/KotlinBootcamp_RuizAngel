import java.util.Random

fun main() {
    println("Lanzamiento con rollDice (12 caras): ${rollDice(12)}")
    println("Lanzamiento con rollDice (0 caras): ${rollDice(0)}")
    println("Lanzamiento con rollDice2 (6 caras): ${rollDice2(6)}")

    gamePlay(rollDice2)
}

val rollDice = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

fun gamePlay(diceRollOperation: (Int) -> Int) {
    val result = diceRollOperation(6)
    println("El resultado del juego es: $result")
}
