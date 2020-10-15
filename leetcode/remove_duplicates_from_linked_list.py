"""
 Enlace al problema:
    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        newHead = head
        dummy = ListNode(0)
        sol = dummy
        while newHead:
            if not newHead.next:
                dummy.next = None
                break
            if newHead.val != newHead.next.val:
                dummy.next = newHead
                dummy = dummy.next
            newHead = newHead.next

        while newHead:
            dummy.next = newHead
            dummy = dummy.next
            newHead = newHead.next

        return sol.next


if __name__ == "__main__":
    head = ListNode(1)
    head.next = ListNode(1)
    head.next.next = ListNode(2)
    head.next.next.next = ListNode(3)
    head.next.next.next.next = ListNode(3)

    solution = Solution()

    print(solution.deleteDuplicates(head))
    print(solution.deleteDuplicates2(head))
