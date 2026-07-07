package Tree;

public class Q23_Same_Tree_100 {
    // METHOD: 1
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    // METHOD: 1

    // public boolean isSameTree(TreeNode p, TreeNode q) {

    //     // level order.
    //     Queue<TreeNode> queue1 = new LinkedList<>();
    //     Queue<TreeNode> queue2 = new LinkedList<>();

    //     queue1.offer(p);// adding the root node of p tree.
    //     queue2.offer(q);// adding the root node of q tree.

    //     while (!queue1.isEmpty() && !queue2.isEmpty()) {
    //         TreeNode temp1 = queue1.poll();
    //         TreeNode temp2 = queue2.poll();

    //         if (temp1 == null && temp2 == null) {
    //             continue;
    //         }

    //         if ((temp1 == null && temp2 != null) || (temp1 != null && temp2 == null)) {
    //             return false;
    //         }
    //         if (temp1.val != temp2.val) {
    //             return false;
    //         }
    //         // adding p tree node.
    //         queue1.offer(temp1.left);
    //         queue1.offer(temp1.right);

    //         // adding q tree node.
    //         queue2.offer(temp2.left);
    //         queue2.offer(temp2.right);

    //     }
    //     return queue1.isEmpty() && queue2.isEmpty();
    // }
}
