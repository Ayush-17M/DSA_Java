package Tree;

public class Q10_Invert_BT_226 {
    public TreeNode invertTree(TreeNode root) {
        // Base condition
        if(root == null){
            return null;
        }

        TreeNode left = invertTree(root.left); // get left node of tree.
        TreeNode right = invertTree(root.right); // get righ node of tree.

        // swap
        root.left = right;
        root.right = left;

        return root;
    }
}
