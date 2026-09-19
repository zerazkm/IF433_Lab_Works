package oop_133907_SebastianReinhart.week04

fun main() {

    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Manager bonus: Rp${manager.calculateBonus()}")

    val developer = Developer("Andi", 8000000, "Kotlin")
    developer.work()
    println("Developer bonus: Rp${developer.calculateBonus()}")

    val vehicle = Vehicle("Generic Vehicle")
    vehicle.accelerate()
    vehicle.honk()

    println()

    val car = Car("Toyota", 4)
    car.accelerate()
    car.honk()

    println("Jumlah pintu: ${car.numberOfDoors}")

    val electricCar = ElectricCar("Tesla", 4, 90)
    electricCar.accelerate()
    electricCar.honk()
}

