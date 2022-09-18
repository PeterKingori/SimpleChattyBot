fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val fourth = readln().toInt()
    val fifth = readln().toInt()
    println(fifth in first..second && fifth in third..fourth)
}