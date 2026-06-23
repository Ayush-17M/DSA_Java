package Tree;

public class Q14_Validate_BST_98 {

//    Given the root of a binary tree, determine if it is a valid binary search tree (BST).

    public boolean isValidBST(TreeNode root) {

        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }

        if(low != null && node.val <= low){
            return false;
        }
        if(high != null && node.val >= high){
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }

}
