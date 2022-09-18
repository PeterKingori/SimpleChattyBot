fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var product = 1L
    for (i in a until b) {
        product *= i
    }
    println(product)
}