package oop_133907_SebastianReinhart.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000

    println("Nama: ${e.name}")
    println("Gaji Bulanan: ${e.salary}")
    println("Gaji Tahunan: ${e.annualSalary}")

    e.increasePerformance()
    e.printStatus()
}