fun main() {
    var minNum = Int.MAX_VALUE
    val numbers = readln().toInt()
    repeat(numbers) {
        val number = readln().toInt()
        if (number < minNum) minNum = number
    }
    println(minNum)
}