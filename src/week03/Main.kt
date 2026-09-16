package oop_133907_SebastianReinhart.week03

fun main() {
    val weapon = Weapon("Excalibur", 500)

    println("Weapon: ${weapon.name}")
    println("Damage awal: ${weapon.damage}")
    println("Tier: ${weapon.tier}")

    println("\nSet damage ke -50:")
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    println("\nSet damage ke 9999:")
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}