package oop_133907_SebastianReinhart.week03

class Weapon(
    val name: String,
    damage: Int
) {

    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif!")
            } else if (value > 1000) {
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = if (damage > 800) {
            "Legendary"
        } else if (damage > 500) {
            "Epic"
        } else {
            "Common"
        }
}