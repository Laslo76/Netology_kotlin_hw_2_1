fun main() {
    val taxRate: Double = 0.75 // Ставка в %
    val minPayment: Int = 3500 // минимальная комиссия

    val sumTransfer: Int = 50000 // сумма перевода в копейках

    var result: Int = (sumTransfer * taxRate / 100).toInt()
    result = if (result < minPayment) minPayment else result
    println("Сумма комиссии за перевод: $result копеек")
}