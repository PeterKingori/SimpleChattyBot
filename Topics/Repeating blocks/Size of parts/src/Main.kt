fun main() {
    val totalParts = readln().toInt()
    var perfectParts = 0
    var largerParts = 0
    var rejections = 0
    repeat(totalParts) {
        val detector = readln().toInt()
        if (detector == 1) largerParts++
        if (detector == -1) rejections++
        if (detector == 0) perfectParts++
    }
    print("$perfectParts $largerParts $rejections")
}