const val TWENTY = 20
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val result = a + b == TWENTY || a + c == TWENTY || b + c == TWENTY
    println(result)
}