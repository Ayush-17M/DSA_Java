package Tree;

public class Q12_Convert_Array_to_BST_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        return createTree(nums, start, end);
    }
    // creating the tree.
    public TreeNode createTree(int[] nums, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode node = new TreeNode(nums[mid]); // creating a node.

        node.left = createTree(nums, start, mid-1); // node are connect to left side of root node.
        node.right = createTree(nums, mid+1, end); // node are connect to right side of root node/

        return node;
    }
}
