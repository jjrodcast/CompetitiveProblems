"""
 Enlace al problema:
    https://leetcode.com/problems/same-tree/

 Si deseas probar la solución sólo tienes que copiar la clase Solution
 ya que dicha clase es la que se ejecuta en la plataforma de LeetCode.
"""



class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q:
            return True
        elif (p and not q) or (not p and q):
            return False
        else:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right) and p.val == q.val


if __name__ == "__main__":
    p = TreeNode(val=1, left=TreeNode(2), right=TreeNode(3))
    q = TreeNode(val=1, left=TreeNode(2), right=TreeNode(3))

    solution = Solution()
    print(solution.isSameTree(p, q))
