fun isVowel(letter: Char) = letter == 'a' ||
    letter == 'e' || letter == 'i' ||
    letter == 'o' || letter == 'u'

fun main() {
    val letter = readLine()!!.first().lowercaseChar()

    println(isVowel(letter))
}