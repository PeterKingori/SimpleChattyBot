fun main() {

    var sum = 0
    do {
        val num = readln().toInt()
        sum += num
    } while (num != 0)
    println(sum)
}