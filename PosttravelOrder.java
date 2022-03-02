

class Node
{
    int data;
    Node left;
    Node right;
    Node(int n)
    {
        this.data=n;
        this.left=this.right=null;
    }
}
class BST
{
    Node root;
    void insert(int n)
    {
        Node curr=new Node(n);
        if(this.root==null)
            this.root=curr;
        else
        {
            Node temp=root;
            while(true)
            {
               if(n<temp.data) 
               {
                   if(temp.left==null)
                   {
                       temp.left=curr;
                       break;
                   }
                   else
                       temp=temp.left;
               }
                else
                {
                   if(temp.right==null)
                   {
                       temp.right=curr;
                       break;
                   }
                    else 
                        temp=temp.right;
                }
            }
        }
    }
    void postorder()
    {
        postorder_helper(this.root);
        System.out.println();
    }
    void postorder_helper(Node a)
    {
        if(a==null)
            return;
        postorder_helper(a.left);
         postorder_helper(a.right);
        System.out.print(a.data+" ");
        
    }
}

