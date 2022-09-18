fun main() {
    val invitation = readLine().toBoolean()
    val hasGift = readLine().toBoolean()
    val allow = invitation && hasGift
    println(allow)
}