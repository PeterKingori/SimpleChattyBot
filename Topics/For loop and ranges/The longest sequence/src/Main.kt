fun main() {
    val numbers = readln().toInt()
    var previousNumber = Int.MIN_VALUE
    var length = 0
    var count = 0

    repeat(numbers) {
        val number = readln().toInt()
        if (number >= previousNumber) {
            length++
        } else {
            length = 1
        }
        previousNumber = number
        if (length > count) count = length
    }
    println(count)
}