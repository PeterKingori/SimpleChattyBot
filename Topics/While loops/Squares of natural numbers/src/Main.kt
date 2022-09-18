fun main() {
    val number = readln().toInt()
    var num = 1
    while (num * num <= number) {
        println(num * num)
        num++
    }
}