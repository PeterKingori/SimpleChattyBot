const val TEN = 10
fun main() {
    val number = readln().toInt()
    val lastDigit = number % TEN
    println(lastDigit)
}
