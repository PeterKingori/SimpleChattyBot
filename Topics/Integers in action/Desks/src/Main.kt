fun main() {
    val group1 = readln().toInt()
    val group2 = readln().toInt()
    val group3 = readln().toInt()
    val class1 = group1 / 2 + group1 % 2
    val class2 = group2 / 2 + group2 % 2
    val class3 = group3 / 2 + group3 % 2
    val desks = class1 + class2 + class3
    println(desks)
}