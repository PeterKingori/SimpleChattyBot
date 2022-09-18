fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val inRange = a >= b && a <= c || a >= c && a <= b
    println(inRange)
}