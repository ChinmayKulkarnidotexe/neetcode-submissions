# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:

        def isSym(a, b):
            if not a and not b: return True
            if not a or not b:
                return False
            return a.val == b.val and isSym(a.left, b.left) and isSym(a.right, b.right)
        
        def dfs(node):
            if not node:
                return False
            if node.val == subRoot.val and isSym(node, subRoot):
                return True
            else:
                return (dfs(node.left) or
                dfs(node.right))
        
            return  False
        return dfs(root)
        
            
