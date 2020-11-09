import java.util.*

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }

// This solution is giving TLE (refactor and test it again with a beeter approach)
private fun minimizing(k: Int, binary: CharArray): String {
    var movements = k
    val queue: Queue<Int> = LinkedList()
    var sol = ""
    for ((idx, c) in binary.withIndex()) {
        if (c == '0') queue.add(idx)
    }
    binary.forEachIndexed { idx, _ ->
        if (queue.isNotEmpty()) {
            val zeroPos = queue.peek()!!
            val movementsNeeded = zeroPos - idx
            if (movementsNeeded <= movements) {
                movements -= movementsNeeded
                sol += '0'
                queue.remove()
            } else {
                sol += '1'
            }
        } else {
            sol += '1'
        }
    }
    return sol
}

fun main() {
    val q = readInt()
    repeat(q) {
        val (n, k) = readInts()
        val binary = readLn()
        println(minimizing(k, binary.toCharArray()))
    }
}