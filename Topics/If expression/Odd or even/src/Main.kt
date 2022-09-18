import kotlin.math.abs

fun main() {
    println(if (abs(readln().toInt()) % 2 == 0) "EVEN" else "ODD")
}