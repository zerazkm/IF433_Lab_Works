package oop_133907_SebastianReinhart.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)
    var enemyHp = 100

    println("\n$name memasuki pertarungan!")

    while (hero.isAlive() && enemyHp > 0) {

        println("\n=== MENU ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()

                println("Enemy menyerang balik!")
                println("Damage: $enemyDamage")

                hero.takeDamage(enemyDamage)

                println("HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {

            println("$name kabur!")
            break

        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (enemyHp <= 0) {
        println("$name MENANG! 🎉")
    } else if (!hero.isAlive()) {
        println("Enemy MENANG!")
    } else {
        println("$name berhasil kabur.")
    }
}