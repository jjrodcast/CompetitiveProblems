/*
* Enlace al problema: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
*
* La solución se encuentra dentro de la función `sumOddLengthSubarrays`, el resto del código es para
* ejecutarlo de manera local.
*
* */

class SolutionArray {

    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var totalSum = 0
        val size = arr.size
        arr.forEachIndexed { index, value ->
            val totalSubArrays = (index + 1) * (size - index)
            val oddSubArrays =
                if (totalSubArrays % 2 == 1) (totalSubArrays / 2) + 1 else totalSubArrays / 2
            totalSum += oddSubArrays * value
        }
        return totalSum
    }
}

fun main() {

    val solution = SolutionArray()
    println(solution.sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)))
    println(solution.sumOddLengthSubarrays(intArrayOf(1, 2)))
    println(solution.sumOddLengthSubarrays(intArrayOf(10, 11, 12)))
}