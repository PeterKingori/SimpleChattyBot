fun main() {
    val char1 = readln().first()
    val char2 = readln().first()
    val char3 = readln().first()
    val order = char2 == char1 + 1 && char3 == char1 + 2
    println(order)
}