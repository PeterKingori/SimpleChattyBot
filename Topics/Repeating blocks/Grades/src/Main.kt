const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
fun main() {
    val students = readln().toInt()
    var gradeA = 0
    var gradeB = 0
    var gradeC = 0
    var gradeD = 0
    repeat(students) {
        val score = readln().toInt()
        if (score == TWO) gradeD++
        if (score == THREE) gradeC++
        if (score == FOUR) gradeB++
        if (score == FIVE) gradeA++
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}