"""
 Enlace al problema:
    https://leetcode.com/problems/array-partition-i/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.

"""
from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        total = 0
        nums.sort()
        for i in range(0, len(nums), 2):
            if i is None:
                break
            total += nums[i]
        return total


if __name__ == "__main__":
    solution = Solution()
    print(solution.arrayPairSum([1, 4, 3, 2]))
    print(solution.arrayPairSum([1, 1, 1, 1]))
