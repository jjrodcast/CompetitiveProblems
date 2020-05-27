private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val t = readInt()
    for (i in 0 until t) {
        val n = readInt()
        val candies = readInts().toIntArray()
        var (moves, alice, bob) = Triple(0, 0, 0)
        var (idxAlice, idxBob) = Pair(0, n - 1)
        val totalAlice = arrayListOf<Int>()
        val totalBob = arrayListOf<Int>()
        var isAlice = true
        while (true) {
            if (idxAlice > idxBob) break
            if (isAlice) {
                alice = 0
                while (true) {
                    if (alice > bob || idxAlice > idxBob) break
                    alice += candies[idxAlice++]
                }
                totalAlice.add(alice)
            } else {
                bob = 0
                while (true) {
                    if (bob > alice || idxAlice > idxBob) break
                    bob += candies[idxBob--]
                }
                totalBob.add(bob)
            }
            moves++
            isAlice = !isAlice
        }
        println("$moves ${totalAlice.sum()} ${totalBob.sum()}")
    }
}