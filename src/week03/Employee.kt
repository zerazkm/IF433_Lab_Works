package oop_133907_SebastianReinhart.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}