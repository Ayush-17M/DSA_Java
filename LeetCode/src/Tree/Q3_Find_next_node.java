package Tree;

// Q. Given a root of the binary tree and k is node of the tree,
// Traversed the node of the tree where node == k return the next node of the tree.

import java.util.LinkedList;
import java.util.Queue;

public class Q3_Find_next_node {
    public TreeNode findNextNode(TreeNode root, int k){
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // store the root node.

        while(!queue.isEmpty()){

            TreeNode currentNode = queue.poll(); // get the first node which are store in queue.

            if(currentNode.left != null){ // if current node having the left child.
                queue.offer(currentNode.left);  // -> Store in queue.
            }
            if(currentNode.right != null){  // if current node having the right child.
                queue.offer(currentNode.right);  // -> Store in queue.
            }

            if(currentNode.val == k){
                break;
            }
        }
        return queue.peek();
    }
}
