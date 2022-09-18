import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var maxNum = Int.MIN_VALUE
    var counter = 0
    var position = 0

    while (scanner.hasNextInt()) {
        counter++
        val input = scanner.nextInt()
        if (input > maxNum) {
            maxNum = input
            position = counter
        }
    }

    println("$maxNum $position")
}