package oop_133907_SebastianReinhart.week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}