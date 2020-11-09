private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }

fun main() {
    val q = readInt()
    repeat(q) {
        val n = readInt()
        val goods = readLongs()
        val total = goods.sum()
        println(if (total % n == 0L) total / n else (total / n) + 1)
    }
}