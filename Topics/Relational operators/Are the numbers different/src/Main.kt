fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val equality = a != b && a != c && b != c
    println(equality)
}