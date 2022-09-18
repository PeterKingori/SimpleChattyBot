fun main() {
    val numbers = readln().toInt()
    var sum = 0
    repeat(numbers) {
        sum += readln().toInt()
    }
    println(sum)
}