import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var message = ""
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (balance >= purchase) {
            balance -= purchase
            message = "Thank you for choosing us to manage your account! Your balance is $balance."
        } else {
            message = "Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase."
        }
    }
    println(message)
}