package Tree;

public class Q13_BT_to_Linked_List_114 {

    public void flatten(TreeNode root) {
        TreeNode currentNode = root;  // currentNode pointing the root node.

        while (currentNode != null) {

            if (currentNode.left != null) { // When left node is not null.

                TreeNode temp = currentNode.left; // temp is point the left node of currerntNode.

                while (temp.right != null) { // travers the right of temp node.
                    temp = temp.right;
                }
                // at the end of the while loop temp are pointing the right leaf node of currentNode.left.


                temp.right = currentNode.right; // shift the currentNode.right node to temp.right
                currentNode.right = currentNode.left; // shift currentNode.left to currentNode.right.
                currentNode.left = null;  // left currentNode is null.
            }

            currentNode = currentNode.right;
        }
    }
}
