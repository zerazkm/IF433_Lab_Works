package oop_133907_SebastianReinhart.week06

fun processCheckout(payment: PaymentMethod, amount: Double) {
    payment.pay(amount)
}

fun main() {
    val gopay = Gopay()
    val creditCard = CreditCard()

    processCheckout(gopay, 150000.0)
    processCheckout(creditCard, 250000.0)
}