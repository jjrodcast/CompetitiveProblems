private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }


private fun createLetters(): List<Char> {
    val letters = arrayListOf<Char>()
    val range = 97..122
    for (c in range) {
        letters.add(c.toChar())
    }
    return letters
}

fun main() {
    val letters = createLetters()
    val t = readInt()
    repeat(t) {
        val (n, a, b) = readInts()
        val distincts = letters.take(b)

        var idx = 0
        var out = ""
        var temp = n
        while (temp > 0) {
            if (idx == distincts.size) idx = 0
            out += distincts[idx]
            idx++
            temp--
        }
        println(out)
    }


}