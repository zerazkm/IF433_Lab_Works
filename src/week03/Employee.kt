package oop_133907_SebastianReinhart.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val annualSalary: Int
        get() = salary * 12
}