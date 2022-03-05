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
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        ans=0;
        paths(root,targetSum);
        return ans;
    }
    public void paths(TreeNode root,int targetSum)
    {
        if(root==null)
            return;
        pathSumH(root,targetSum,0);
        paths(root.left,targetSum);
            paths(root.right,targetSum);
    }
    public void pathSumH(TreeNode root,int targetSum,int csum)
    {
        if(root==null)
            return ;
        if(csum+root.val==targetSum)
            ans++;
        pathSumH(root.left,targetSum,csum+root.val);
        pathSumH(root.right,targetSum,csum+root.val);
    }
}
