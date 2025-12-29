fun main() {
    val tax_rate: Double = 0.75 // Ставка в %
    val min_payment: Int = 3500 // минимальная комиссия

    val sum_transer: Int = 5000000 // сумма перевода в копейках

    var sum_tax: Int = (sum_transer * tax_rate / 100).toInt()
    sum_tax = if (sum_tax < min_payment) min_payment else sum_tax
    println(sum_tax) 
}