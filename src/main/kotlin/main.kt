import kotlin.math.roundToInt

fun main() {
    val taxRate = 0.75 // Ставка в %
    val minPayment = 35 // минимальная комиссия

    val amount = 4700 // сумма перевода в рублях

    val preliminaryCommission = (amount * taxRate / 100)
    val commission = if (minPayment > preliminaryCommission) minPayment else preliminaryCommission.roundToInt()

    //val commission = listOf((amount * taxRate / 100), minPayment).max().roundToInt()

    println("Сумма комиссии за перевод: $commission руб.")
}