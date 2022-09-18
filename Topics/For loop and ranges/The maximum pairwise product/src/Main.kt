fun main() {
    val numbers = readln().toInt()
    if (numbers == 1) {
        println(readln().toInt())
    } else {
        var maxNum1 = readln().toInt()
        var maxNum2 = readln().toInt()
        for (i in 3..numbers) {
            val num = readln().toInt()
            if (num > maxNum1) {
                maxNum2 = maxNum1
                maxNum1 = num
            } else if (num > maxNum2) {
                maxNum2 = num
            }
        }
        val product = maxNum1 * maxNum2
        println(product)
    }
}