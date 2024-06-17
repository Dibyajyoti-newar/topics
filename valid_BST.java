//leetcode problem 98. Validate Binary Search Tree//
import java.util.ArrayList;
import java.util.List;

public class valid_BST {
    List<Integer>result=new ArrayList<>();
    public List<Integer> inOrderTraversal(TreeNode root){
        if(root==null){
            return result;
        }
        inOrderTraversal(root.left);
        result.add(root.val);
        inOrderTraversal(root.right);
        return result;
    }
    public boolean isValidBST(TreeNode root) {
        inOrderTraversal(root);
        boolean a=true;
        for(int i=0;i<result.size()-1;i++){
            
            if(result.get(i)>=result.get(i+1)){
                return false;
            }
        }
        return a;
    }
}

//time complaxity=O(n)
//space complaxity=O(n)