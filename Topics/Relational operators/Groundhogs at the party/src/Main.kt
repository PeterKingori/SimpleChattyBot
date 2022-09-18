fun main() {
    val butterCups = readln().toInt()
    val weekend = readln().toBoolean()
    val partySuccess = butterCups >= 10 && butterCups <= 20 && !weekend
    || butterCups >= 15 && butterCups <= 25 && weekend
    println(partySuccess)
}
