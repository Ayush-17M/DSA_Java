package Tree;

public class Q16_Kth_Smallest_Elem_BST_230 {

    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
// In BST the smallest value present in left side of tree.
        inorder(root, k);
        return ans;
    }
    public void inorder(TreeNode node, int k){
        if(node == null){
            return;
        }

        inorder(node.left, k); // go to left leaf node of tree.

        count++; // increase the count

        if(count == k){ // count == k then we get k smallest value (node.value).
            ans = node.val;
        }

        inorder(node.right, k);
    }
}
