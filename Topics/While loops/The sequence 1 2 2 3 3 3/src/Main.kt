fun main() {
    val elements = readln().toInt()
    var count = 1
    var countTwo = 1

    if (count < elements) {
        while (countTwo <= elements) {
            repeat(count) {
                print("$count ")
                countTwo++
            }
            count++
        }
    }
}