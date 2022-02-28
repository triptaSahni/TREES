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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       boolean ans=Psum(root,targetSum,0);
        return ans;
    }
    boolean Psum(TreeNode root,int T,int csum)
    {
         if(root==null)
            return false;
        if(root.left==null&& root.right==null)
        {
            if(csum+root.val==T)
                return true;
        }
        boolean left=Psum(root.left,T,csum+root.val);
        boolean right=Psum(root.right,T,csum+root.val);
        return left||right;
    }
}
