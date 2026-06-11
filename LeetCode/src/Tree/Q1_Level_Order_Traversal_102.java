package Tree;
import java.util.*;

public class Q1_Level_Order_Traversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();  // storing the final leve order.

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();

            // creating the single list to store the level of node.
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val); // the value of node is stored.

                if(currentNode.left != null){ // if left node is accrued
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){ // if right node is accrued
                    queue.offer(currentNode.right);
                }
            }

            result.add(currentLevel); // Store the collection of level node into a final list.
        }
        return result;
    }
}

