fun main() {
    val minHours = readln().toInt()
    val maxHours = readln().toInt()
    val hoursSlept = readln().toInt()

    println(
        if (hoursSlept >= minHours && hoursSlept <= maxHours) {
            "Normal"
        } else if (hoursSlept < minHours) {
            "Deficiency"
        } else {
            "Excess"
        }
    )
}