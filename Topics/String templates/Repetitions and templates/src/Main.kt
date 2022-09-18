fun main() {
    val word = readln()
    val length = word.length
    println("$length repetitions of the word $word: ${word.repeat(length)}")
}