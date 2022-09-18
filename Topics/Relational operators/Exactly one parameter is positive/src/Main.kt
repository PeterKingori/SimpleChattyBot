const val ZERO = 0
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val aPositive = a > ZERO && b <= ZERO && c <= ZERO
    val bPositive = a <= ZERO && b > ZERO && c <= ZERO
    val cPositive = a <= ZERO && b <= ZERO && c > ZERO
    val result = aPositive || bPositive || cPositive
    println(result)
}