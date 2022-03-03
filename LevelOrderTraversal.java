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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> al=new ArrayList<>();
        if(root==null)
            return al;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);

          List<Integer> li=new ArrayList<>();
        while(!q.isEmpty())
        {
          
            TreeNode p=q.poll();
            if(p==null)
            {
               
                al.add(li);
               
                if(q.isEmpty()==false)
               { 
                    q.add(null);
                    li=new ArrayList<>();
                }
            }
        else
        {
            li.add(p.val);
            if(p.left!=null)
                q.add(p.left);
            if(p.right!=null)
                q.add(p.right);
        }
            
            
        }
        return al;
    }
}
