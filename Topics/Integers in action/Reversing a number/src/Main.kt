const val TEN = 10
const val HUNDRED = 100
fun main() {
    val number = readln().toInt()
    val onesDigit = number % TEN
    val tensDigit = number % HUNDRED / TEN
    val hundredsDigit = number / HUNDRED
    println("$onesDigit$tensDigit$hundredsDigit")
}