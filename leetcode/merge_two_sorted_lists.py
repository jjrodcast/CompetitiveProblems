"""
 Enlace al problema:
    https://leetcode.com/problems/merge-two-sorted-lists/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        headOne, headTwo = l1, l2
        merged = ListNode(0)
        newHead = merged
        while headOne and headTwo:
            if headOne.val <= headTwo.val:
                newHead.next = headOne
                headOne = headOne.next
            else:
                newHead.next = headTwo
                headTwo = headTwo.next
            newHead = newHead.next

        remainElements = headTwo if not headOne else headOne
        newHead.next = remainElements

        return merged.next


if __name__ == "__main__":
    l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next.next = ListNode(4)
    l2 = ListNode(1)
    l2.next = ListNode(3)
    l2.next.next = ListNode(4)

    solution = Solution()
    print(solution.mergeTwoLists(l1, l2))
