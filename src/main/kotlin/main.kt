fun main() {
    val taxRate: Double = 0.75 // Ставка в %
    val minPayment: Int = 35 // минимальная комиссия

    val amount: Int = 500 // сумма перевода в рублях

    val commission: Int = (amount * taxRate / 100).toInt()

    println("Сумма комиссии за перевод: ${if (commission < minPayment) minPayment else commission} руб.")
}