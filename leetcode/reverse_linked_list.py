"""
 Enlace al problema:
    https://leetcode.com/problems/reverse-linked-list/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        head, _next = self.__recursive(head)
        _next.next = None
        return head

    def __recursive(self, head: ListNode) -> (ListNode, ListNode):
        if not head.next:
            return head, head

        node, _next = self.__recursive(head.next)
        _next.next = head

        return node, head


if __name__ == "__main__":
    solution = Solution()

    head = ListNode(1, ListNode(2))
    head.next = ListNode(3)
    head.next.next = ListNode(4)
    head.next.next.next = ListNode(5)

    print(solution.reverseList(head))
