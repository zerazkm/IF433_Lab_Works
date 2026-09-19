package oop_133907_SebastianReinhart.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }

    override fun honk() {
        println("Tiiin tiiin!")
    }
}