package Tree;

public class Q8_Diameter_of_BT_543 {

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left); // height of left node
        int rightHeight = height(node.right); // height ot right node

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia, diameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
