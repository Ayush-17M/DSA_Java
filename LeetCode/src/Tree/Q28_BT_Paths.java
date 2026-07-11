package Tree;
import java.util.ArrayList;
import java.util.List;

public class Q28_BT_Paths {

    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        helper(root, "");
        return list;
    }

    public void helper(TreeNode node, String str) {

        if (node != null && node.left == null && node.right == null) { // leaf node
            str += node.val;
            list.add(str);
            return;
        }
        str += node.val + "->";

        if (node.left != null) { // if left node are exist.
            helper(node.left, str);
        }
        if (node.right != null) { // if right node are exist.
            helper(node.right, str);
        }

        return;
    }
}
