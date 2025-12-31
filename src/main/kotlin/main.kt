fun main() {
    val taxRate: Double = 0.75 // Ставка в %
    val minPayment: Int = 35 // минимальная комиссия

    val amount: Int = 5000 // сумма перевода в рублях

    var result: Int = (amount * taxRate / 100).toInt()
    result = if (result < minPayment) minPayment else result
    println("Сумма комиссии за перевод: $result руб.")
}