fun main() {
    val inputChar = readln().first()
    val check = inputChar.isUpperCase() || inputChar >= '1' && inputChar <= '9'
    println(check)
}