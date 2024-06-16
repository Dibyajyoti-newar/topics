//cheking symmetrycity of a binary tree//
class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

}
public class check_symmetry_of_tree {
    public boolean check(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return check(left.left,right.right)&&check(right.left,left.right);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}
