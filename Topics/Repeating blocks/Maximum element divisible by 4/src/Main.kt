fun main() {
    val n = readln().toInt()
    var maxNum = 0
    repeat (n) {
        val input = readln().toInt()
        if (input % 4 == 0 && input > maxNum) {
            maxNum = input
        }
    }
    println(maxNum)
}
