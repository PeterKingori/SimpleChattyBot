fun main() {
    val input = readln().toInt()
    println(
        if (input > -15 && input <= 12 ||
            input > 14 && input < 17 ||
            input >= 19
        ) {
            "True"
        } else "False"
    )
}