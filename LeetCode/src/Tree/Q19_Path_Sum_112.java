package Tree;

public class Q19_Path_Sum_112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }

        // return helper(root, targetSum);

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
    // public boolean helper(TreeNode node, int targetSum){
    //     if(0 == targetSum){
    //         return true;
    //     }
    //     if(node == null){
    //         return false;
    //     }
    //     boolean leftSum =  helper(node.left, targetSum-node.val);
    //     boolean rightSum = helper(node.right, targetSum-node.val);

    //     return leftSum || rightSum;
    // }
}
