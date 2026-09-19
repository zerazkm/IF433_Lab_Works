package oop_133907_SebastianReinhart.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun accelerate() {
        speed += 20
        println("$brand berakselerasi. Kecepatan: $speed km/jam")
    }

    override fun honk() {
        println("Tiiin tiiin!")
    }
}