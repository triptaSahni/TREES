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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
    int lsh=height(root.left);
        int rsh=height(root.right);
        boolean isRootBal=Math.abs(lsh-rsh)>1?false:true;
       
           boolean isLeftBal=isBalanced(root.left);
        boolean isRightBal=isBalanced(root.right);
        return isRootBal&&isLeftBal&&isRightBal;
        
    }
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int lH=height(root.left);
        int rH=height(root.right);
        return (Math.max(lH,rH)+1);
    }
}
