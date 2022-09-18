fun main() {
    var maxNum = Int.MIN_VALUE
    do {
        val num = readln().toInt()
        if (num > maxNum) maxNum = num
    } while (num != 0)
    println(maxNum)
}