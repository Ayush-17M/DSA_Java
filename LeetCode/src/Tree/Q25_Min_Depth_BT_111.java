package Tree;

public class Q25_Min_Depth_BT_111 {
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left == 0 || right == 0){ // if lift or right == null
            return Math.max(left, right) + 1;
        }
        else{  // both node present
            return Math.min(left, right) + 1;
        }
    }
}
