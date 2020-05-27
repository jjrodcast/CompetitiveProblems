private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

private fun wasSquare(a: Int, b: Int, c: Int, d: Int): Boolean {
    val r1 = if (a == c) a == b + d else false
    val r2 = if (a == d) a == b + c else false
    val r3 = if (b == c) b == a + d else false
    val r4 = if (b == d) b == a + c else false
    return r1 || r2 || r3 || r4
}

fun main() {
    val t = readInt()
    for (i in 0 until t) {
        val (a, b) = readInts()
        val (c, d) = readInts()
        if (wasSquare(a, b, c, d)) println("Yes") else println("No")
    }
}