package oop_133907_SebastianReinhart.week03

fun main() {
    val player = Player("Budi")

    println("Username: ${player.username}")
    println("Level awal: ${player.level}")

    player.addXp(50)
    println("Level setelah +50 XP: ${player.level}")

    player.addXp(60)
    println("Level setelah +60 XP: ${player.level}")
}