import kotlin.math.pow

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }


fun main() {
    val t = readInt()
    for (i in 0 until t) {
        var num = readInt()
        var pos = 0
        val elements = arrayListOf<Int>()
        while (num > 0) {
            val res = num % 10
            num /= 10
            if (res != 0) elements.add(res * 10.0.pow(pos.toDouble()).toInt())
            pos++
        }
        println(elements.size)
        for (idx in elements.indices) {
            if (idx == 0) print(elements[idx])
            else print(" ${elements[idx]}")
        }
        println()
    }
}