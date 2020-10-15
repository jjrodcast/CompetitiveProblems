"""
 Enlace al problema:
    https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""

from typing import List


class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        negatives = sum([1 for row in grid for element in row if element < 0])
        return negatives


if __name__ == '__main__':
    solution = Solution()

    print(solution.countNegatives([[4, 3, 2, -1], [3, 2, 1, -1], [1, 1, -1, -2], [-1, -1, -2, -3]]))
    print(solution.countNegatives([[3, 2], [1, 0]]))
    print(solution.countNegatives([[1, -1], [-1, -1]]))
    print(solution.countNegatives([[-1]]))
