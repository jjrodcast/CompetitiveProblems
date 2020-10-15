"""
 Enlace al problema:
    https://leetcode.com/problems/squares-of-a-sorted-array/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.

 Este problema he realizado dos enfoques:

 Enfoque 1:
    Consiste en realizar el cálculo de los valores al cuadrado
    sin usar el método sort para ordenarlos

 Enfoque 2:
    Consiste en realizar el cálculo de los valores al cuadrado
    usando el método sort.

"""

from typing import List


class Solution:

    def sortedSquares(self, A: List[int]) -> List[int]:
        B = [num * num for num in A if num >= 0]
        C = [num * num for num in A if num < 0]
        positive_idx = 0
        if len(B) > 0:
            for i in range(len(C) - 1, -1, -1):
                while C[i] > B[positive_idx]:
                    positive_idx += 1
                    if positive_idx >= len(B):
                        break
                B.insert(positive_idx, C[i])
        else:
            B = C

        return B

    def sortedSquaresWithSort(self, A: List[int]) -> List[int]:
        B = [num * num for num in A]
        return sorted(B)


if __name__ == '__main__':
    solution = Solution()
    print(solution.sortedSquares([-4, -1, 0, 3, 10]))
    print(solution.sortedSquares([-7, -3, 2, 3, 11]))
    print(solution.sortedSquares([0, 2, 3, 11]))
    print(solution.sortedSquares([]))
