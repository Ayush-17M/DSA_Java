package Tree;
import java.util.*;
// Serialize -> process of converting the tree into a string.
// Deserialize -> process of converting the string into a tree.

// this solution is not optimize.

public class Q18_Serialize_Deserialize_297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return helper(root, "");

    }

    private String helper(TreeNode node, String str) {
        if (node == null) {
            return str + "null,";
        }

        str += node.val + ",";

        str = helper(node.left, str);
        str = helper(node.right, str);

        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // string are split by , and stored in queue.
        Queue<String> que = new LinkedList<>(Arrays.asList(data.split(",")));

        return helper(que);
    }

    private TreeNode helper(Queue<String> q) {

        String val = q.poll(); // get first value

        if (val.equals("null"))
            return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper(q);
        node.right = helper(q);

        return node;
    }
}
