package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Q8_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        // Level Order Triversing

        // creating the queue of store the node.
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null){
                continue;
            }
            if(left == null || right == null){
                return false;
            }
            if(left.val != right.val){
                return false;
            }

            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }
}
