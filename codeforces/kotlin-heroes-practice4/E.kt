private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val t = readInt()
    (1..t).forEach { _ ->
        val n = readInt()

        if (n < 4) println("-1")
        else {
            var odd = if (n and 1 == 1) n else n - 1
            while (odd >= 1) {
                print("$odd ")
                odd -= 2
            }
            print("4 2")
            odd = 6
            while (odd <= n) {
                print(" $odd")
                odd+=2
            }
            println()
        }

    }
}
