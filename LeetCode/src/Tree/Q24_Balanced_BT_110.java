package Tree;

public class Q24_Balanced_BT_110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftHeight = findHeight(root.left); // Height of left subtree.
        int rightHeight = findHeight(root.right); // Height of right subtree.

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int findHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        return 1 + Math.max(findHeight(node.left),findHeight(node.right));
    }
}
