fun main() {
    val inputString = readln()
    val number = readln().toInt()
    println("Symbol # $number of the string \"$inputString\" is \'${inputString[number - 1]}\'")
}