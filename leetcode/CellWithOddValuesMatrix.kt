/*
* Enlace al problema: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
*
* La solución se encuentra dentro de la función `oddCells`, el resto del código es para
* ejecutarlo de manera local.
*
*  */

class SolutionCell {
    fun oddCells(n: Int, m: Int, indices: Array<IntArray>): Int {
        val array = Array(n) { IntArray(m) { 0 } }
        indices.forEach { pair ->
            val (ri, ci) = pair
            array[ri].forEachIndexed { index, _ -> array[ri][index] += 1 }
            array.forEach { row ->
                row.forEachIndexed { index, _ -> if (index == ci) row[index] += 1 }
            }
        }

        return array.map { row -> row.toList() }.flatten().filter { it % 2 != 0 }.count()
    }
}


fun main() {
    val test = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(0, 0)
    )

    val solution = SolutionCell()
    println(solution.oddCells(2, 2, test))
}