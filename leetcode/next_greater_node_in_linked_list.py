"""
 Enlace al problema:
    https://leetcode.com/problems/next-greater-node-in-linked-list/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""
from typing import List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def nextLargerNodes(self, head: ListNode) -> List[int]:
        # input  :  [1, 7, 5, 1, 9, 2, 5, 1]
        # output :  [7, 9, 9, 9, 0, 5, 0, 0]
        newHead = head
        sol, stack = [], []
        pos = 0
        while newHead:
            value = newHead.val
            while len(stack) > 0 and sol[stack[-1]] < value:
                sol[stack.pop()] = value
            sol.append(value)
            stack.append(pos)

            newHead = newHead.next
            pos += 1

        while len(stack) > 0:
            sol[stack.pop()] = 0

        return sol


if __name__ == "__main__":
    head = ListNode(1)
    head.next = ListNode(7)
    head.next.next = ListNode(5)
    head.next.next.next = ListNode(1)
    head.next.next.next.next = ListNode(9)
    head.next.next.next.next.next = ListNode(2)
    head.next.next.next.next.next.next = ListNode(5)
    head.next.next.next.next.next.next.next = ListNode(1)

    solution = Solution()
    print(solution.nextLargerNodes(head))
