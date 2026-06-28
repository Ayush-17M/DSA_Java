package Tree;

public class Q20_Sum_Root_Leaf_129 {
//    For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        sum = sum * 10 + node.val;

        if(node.left == null && node.right == null){ // leaf node.
            return sum;
        }

        return helper(node.left, sum) + helper(node.right, sum);
    }
}
