"""
 Enlace al problema:
    https://leetcode.com/problems/delete-node-in-a-linked-list/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def deleteNode(self, node):
        node.val = node.next.val
        node.next = node.next.next


if __name__ == "__main__":
    node = ListNode(1)
    node.next = ListNode(2)
    node.next.next = ListNode(3)
    node.next.next.next = ListNode(4)
    node.next.next.next.next = ListNode(5)

    solution = Solution()
    print(solution.deleteNode(node))
