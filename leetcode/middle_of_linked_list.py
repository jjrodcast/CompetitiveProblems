"""
 Enlace al problema:
    https://leetcode.com/problems/middle-of-the-linked-list/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def middleNode(self, head: ListNode) -> int:
        totalNodes = self.__countNodes(head)
        mid = totalNodes // 2
        newHead = head
        pos = 0
        while pos < mid:
            newHead = newHead.next
            pos += 1
        return newHead

    def __countNodes(self, head: ListNode) -> int:
        total = 0
        node = head
        while node:
            total += 1
            node = node.next

        return total


if __name__ == "__main__":
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)
    head.next.next.next.next = ListNode(5)
    head.next.next.next.next.next = ListNode(6)

    solution = Solution()

    print(solution.middleNode(head))
