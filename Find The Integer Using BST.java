boolean search(int data)
{
    Node temp=root;
    int c=0;
    if(temp.data==data)
        return true;
    else{
    while(temp!=null)
    {
        if(data<temp.data)
        { 
            temp=temp.left;
           if(temp!=null && temp.data==data)
            { 
               
                c=1;
                break;
            }
           
            
        }
        else
        {
            temp=temp.right;
          
            if(temp!=null && temp.data==data)
            {
                 c=1;
                break;
            }
           
          
        }
            
    }
    if(c==1)
        return true;
    else
        return false;
    }
}
