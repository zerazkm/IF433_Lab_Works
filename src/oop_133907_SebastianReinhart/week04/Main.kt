package oop_133907_SebastianReinhart.week04

fun main() {
    val vehicle = Vehicle("Generic Vehicle")
    vehicle.accelerate()
    vehicle.honk()

    println()

    val car = Car("Toyota", 4)
    car.accelerate()
    car.honk()

    println("Jumlah pintu: ${car.numberOfDoors}")
}