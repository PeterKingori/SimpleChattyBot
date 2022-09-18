const val LOWER_LIMIT = 18
const val UPPER_LIMIT = 59
fun main() {
    val age = readln().toInt()
    println(age in LOWER_LIMIT..UPPER_LIMIT)
}