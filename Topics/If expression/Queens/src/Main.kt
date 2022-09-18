import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val horizontalAttack = abs(x1 - x2) > 0 && y1 - y2 == 0
    val verticalAttack = abs(y1 - y2) > 0 && x1 - x2 == 0
    val diagonalAttack = abs(x1 - x2) == abs(y1 - y2)

    println(
        if (horizontalAttack || verticalAttack || diagonalAttack) "YES" else "NO"
    )
}