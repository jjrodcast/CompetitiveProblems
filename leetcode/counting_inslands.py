"""
 Enlace al problema:
    https://leetcode.com/problems/number-of-islands/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""

from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        islands = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    islands += 1
                    self.__recursive_count(grid, i, j)
        return islands

    def __recursive_count(self, grid, i, j):
        if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]):
            return

        if grid[i][j] == "0":
            return

        grid[i][j] = "0"
        self.__recursive_count(grid, i + 1, j)
        self.__recursive_count(grid, i - 1, j)
        self.__recursive_count(grid, i, j + 1)
        self.__recursive_count(grid, i, j - 1)


if __name__ == '__main__':
    solution = Solution()
    print(solution.numIslands([
        ["1", "1", "1"],
        ["0", "1", "0"],
        ["1", "1", "1"]]))
