/*

Enlace al problema:
    https://leetcode.com/problems/unique-paths-ii/

La solución se encuentra dentro de la función `uniquePathsWithObstacles`, el resto del código es para
ejecutarlo de manera local.


Explanation:

    Given the grid:

          [0,0,0]
          [0,1,0]
          [0,0,0]

    Initial information:
        *) We are at position (0,0) and the target is (2,2)
        *) Inside the grid there are obstacles (1's)

    Question:
        How many paths can we find from initial position to target position?


    Solution
    --------
        1) Add a new `row` and `column` to the grid.

                  [I,0,0,0]
                  [0,X,0,0]
                  [0,0,T,0]
                  [0,0,0,0]

        2) Check if initial position is and obstacle, if true assign `0` otherwise `1`

                  [1,0,0,0]
                  [0,X,0,0]
                  [0,0,T,0]
                  [0,0,0,0]

        3) Now check for the first `row` and the first `column` and if is and
          obstacle assign `0` otherwise the previous value (in this case just `row` or `column`)

                  [1,1,1,1]
                  [1,X,0,0]
                  [1,0,T,0]
                  [1,0,0,0]

        4) Finally we pre-calculate all the other values to the target.
           To do this we need to assign to the current value (x,y) the sum
           of the paths that can lead us to the `target` which are:
           (row, col-1) and (row-1, col)

            * If there is an obstacle in the current position (x,y), we assign `0`


                  [1,1,1,1]
                  [1,0,1,2]
                  [1,1,2,4]
                  [1,2,4,8]

    Time complexity: O(m*n)

*/


class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val rows = obstacleGrid.size
        val cols = obstacleGrid[0].size

        val grid = Array(rows + 1) { IntArray(cols + 1) { 0 } }

        grid[0][0] = if (obstacleGrid[0][0] == 0) 1 else 0

        for (i in 1 until rows) if (obstacleGrid[i][0] == 0) grid[i][0] = grid[i - 1][0]
        for (i in 1 until cols) if (obstacleGrid[0][i] == 0) grid[0][i] = grid[0][i - 1]

        for (i in 1 until rows) {
            for (j in 1 until cols) {
                grid[i][j] = if (obstacleGrid[i][j] == 0) grid[i - 1][j] + grid[i][j - 1] else 0
            }
        }
        return grid[rows - 1][cols - 1]
    }
}


fun main() {
    // Class for Solution
    val solution = Solution()

    // Test #1: Input grid
    val grid = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 0)
    )

    // Test #1: Output solution
    println(solution.uniquePathsWithObstacles(grid))
}