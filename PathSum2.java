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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        psum(root,targetSum,0,ans,curr);
        return ans;
    }
    public void psum(TreeNode root,int targetSum,int csum,List<List<Integer>> ans,List<Integer> curr)
    {
        if(root==null)
            return ;
        if(root.left==null && root.right==null)
        {
            if(csum+root.val==targetSum)
            {
                curr.add(root.val);
                ans.add(new ArrayList(curr));
                curr.remove(curr.size()-1);
                return;
            }
        }
        curr.add(root.val);
        psum(root.left,targetSum,csum+root.val,ans,curr);
        psum(root.right,targetSum,csum+root.val,ans,curr);
        curr.remove(curr.size()-1);
        
    }
}
