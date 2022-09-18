fun main() {
    val length = readln().toInt()
    var totalPositive = 0
    repeat(length) {
        val number = readln().toInt()
        if (number > 0) totalPositive++
    }
    println("$totalPositive")
}