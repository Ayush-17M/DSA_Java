package Tree;

// Q. you are having a root and list , check path are exist which are give in list in tree.

public class Q22_Path_Exist {
    public boolean findPath(TreeNode root, int[] arr){
        if(root == null){
            return arr.length == 0;
        }
        return helper(root, arr, 0);
    }
    public boolean helper(TreeNode node, int[] arr, int index){
        if(node == null){
            return false;
        }
        if(index >= arr.length || arr[index] != node.val){
            return false;
        }
        // true condition
        if(node.left == null && node.right == null && index == arr.length-1){
            return true;
        }

        return helper(node.left, arr, index+1) || helper(node.right, arr, index+1);
    }
}
