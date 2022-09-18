fun main() {
    val numbers = readln().toInt()
    var start = Int.MIN_VALUE
    var count = 0
    repeat(numbers) {
        val number = readln().toInt()
        if (number > start) {
            start = number
            count++
        }
    }
    println(if (count == numbers) "YES" else "NO")
}