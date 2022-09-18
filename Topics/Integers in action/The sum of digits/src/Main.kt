const val TEN = 10
fun main() {
    val number = readln().toInt()
    val onesDigit = number % TEN
    val tensDigit = number / TEN % TEN
    val hundredsDigit = number / TEN / TEN
    val sum = onesDigit + tensDigit + hundredsDigit
    println(sum)
}