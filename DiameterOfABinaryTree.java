/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
     if(root==null)
         return 0;
        int h2=  height(root.left);
        int h3=height(root.right);
        int rootDia=h2+h3;
        int leftDia=diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);
        return Math.max(rootDia,Math.max(leftDia,rightDia));
        
    }
    int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}
