package Tree;

public class Q21_BT_Maximum_PathSum_124 {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
    public int helper(TreeNode node){
        // leaf node
        if(node == null){
            return 0;
        }

        int left = helper(node.left); // left node
        int right = helper(node.right); // right node

        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = left + right + node.val; //

        maxSum = Math.max(maxSum, pathSum);

        return Math.max(left, right) + node.val;
    }

}
