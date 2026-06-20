package Tree;

public class Q11_MaxDepth_Binary_Tree_104 {
    int maxVal = 0;
    public int maxDepth(TreeNode root) {
        // Base condition
        if(root == null){
            return 0;
        }

        // Height of left subtree.
        int leftHeight = maxDepth(root.left);

        // Height of right subtree.
        int rightHeight = maxDepth(root.right);

        maxVal = Math.max(leftHeight, rightHeight)+1;

        return maxVal;

    }
}
