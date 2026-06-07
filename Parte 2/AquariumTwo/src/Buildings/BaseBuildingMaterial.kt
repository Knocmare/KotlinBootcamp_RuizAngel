package Buildings

open class BaseBuildingMaterial(open val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)
class Brick : BaseBuildingMaterial(8)

class Building<out T : BaseBuildingMaterial>(private val buildingMaterial: T) {

    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded: Int
        get() = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        val materialName = buildingMaterial::class.simpleName
        println("$actualMaterialsNeeded $materialName required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    isSmallBuilding(woodBuilding)

    isSmallBuilding(Building(Brick()))
}
