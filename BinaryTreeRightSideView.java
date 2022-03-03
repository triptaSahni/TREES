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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
            List<Integer> li=new ArrayList<>();
        if(root==null)
            return li;
        while(q.isEmpty()==false)
        {
            int size=q.size();
            for(int i=1;i<=size;i++)
            {
                TreeNode p=q.poll();
                if(i==size)
                {
                    li.add(p.val);
                }
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
            }
        }
        return li;
        
    }
}
