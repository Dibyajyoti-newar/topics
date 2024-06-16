//hight or depth of a binary tree//
class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

}
public class hight_of_tree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
