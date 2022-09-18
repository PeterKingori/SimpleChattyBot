const val SECONDS = 3600
const val SIXTY = 60
fun main() {
    val hourOne = readln().toInt()
    val minuteOne = readln().toInt()
    val secondsOne = readln().toInt()
    val hourTwo = readln().toInt()
    val minuteTwo = readln().toInt()
    val secondsTwo = readln().toInt()

    val momentOneSeconds = hourOne * SECONDS + minuteOne * SIXTY + secondsOne
    val momentTwoSeconds = hourTwo * SECONDS + minuteTwo * SIXTY + secondsTwo

    val difference = momentTwoSeconds - momentOneSeconds
    println(difference)
}