private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }

private fun minimizingLinear(n: Int, k: Long, binary: CharArray): String {
    val sol = CharArray(n) { '1' }
    var moveTo = 0
    var totalMovements = k
    for (currentPos in binary.indices) {
        if (binary[currentPos] == '0') {
            val canMove = minOf(totalMovements, (currentPos - moveTo).toLong())
            totalMovements -= canMove
            val pos = (currentPos - canMove).toInt()
            sol[pos] = '0'
            moveTo++
        }
    }

    return sol.joinToString(separator = "")
}

fun main() {
    val q = readInt()
    repeat(q) {
        val (n, k) = readLongs()
        val binary = readLn()
        println(minimizingLinear(n.toInt(), k, binary.toCharArray()))
    }
}