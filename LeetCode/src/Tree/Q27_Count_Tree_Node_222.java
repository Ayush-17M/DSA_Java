package Tree;

public class Q27_Count_Tree_Node_222 {

    // Optimize:
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

// Not Optimize:
    // public int countNodes(TreeNode root) {
    //     int count = 0;

    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);

    //     while(!queue.isEmpty()){
    //         TreeNode node = queue.poll();
    //         if(node == null){
    //             continue;
    //         }
    //         count++;
    //         queue.offer(node.left);
    //         queue.offer(node.right);
    //     }

    //     return count;
    // }

}
