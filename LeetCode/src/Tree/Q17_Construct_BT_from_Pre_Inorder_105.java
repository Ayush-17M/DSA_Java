package Tree;
import java.util.*;

//Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
     //and inorder is the inorder traversal of the same tree, construct and return the binary tree.

public class Q17_Construct_BT_from_Pre_Inorder_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // preorder -> Root, L, R
        // Inorder -> L, Root, R
        if(preorder.length == 0){
            return null;
        }

        int r = preorder[0];
        int index = 0;

        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == r){
                index = i;
            }
        }

        TreeNode node = new TreeNode(r); // making the node which have contained the element which is present in 1st position of preorder array.

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index +1 ), Arrays.copyOfRange(inorder, 0, index));

        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;

    }
}
