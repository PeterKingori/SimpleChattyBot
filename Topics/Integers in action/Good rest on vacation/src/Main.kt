const val TWO = 2
fun main() {
    val duration = readln().toInt()
    val foodCost = readln().toInt()
    val onewayFlight = readln().toInt()
    val hotelPerNight = readln().toInt()

    val totalCost = foodCost * duration + onewayFlight * TWO + hotelPerNight * (duration - 1)
    println(totalCost)
}