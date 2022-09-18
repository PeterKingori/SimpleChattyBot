import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    val beat = if (abs(x1 - x2) == 2 && abs(y1 - y2) == 1 ||
        abs(x1 - x2) == 1 && abs(y1 - y2) == 2
    ) {
        "YES"
    } else {
        "NO"
    }
    println(beat)
}