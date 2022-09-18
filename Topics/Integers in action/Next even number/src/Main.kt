const val ONE = 1
const val TWO = 2
fun main() {
    val input = readln().toInt()
    val remainder = input % TWO
    val nextNumber: Int
    if (remainder == 0) {
        nextNumber = input + TWO
    } else {
        nextNumber = input + ONE
    }
    println(nextNumber)
}