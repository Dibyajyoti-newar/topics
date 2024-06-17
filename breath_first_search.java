
//User function Template for Java


    

import java.util.*;
//import org.w3c.dom.Node;
public class breath_first_search
{
    class Node{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
         ArrayList<Integer>result=new ArrayList<>();
         Queue<Node>q= new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
             Node x=q.remove();
             if(x.left!=null){
                 q.add(x.left);
             }
             if(x.right!=null){
                 q.add(x.right);
             }
             result.add(x.data);
         }
         return result;
    }
    
}



