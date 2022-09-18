const val SIXTY = 60
const val HOURS_PER_DAY = 24
fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // don't change this line
    val seconds = totalSeconds % SIXTY
    val minutes = totalSeconds / SIXTY % SIXTY
    val hours = totalSeconds / SIXTY / SIXTY % HOURS_PER_DAY
    println("$hours:$minutes:$seconds")
}