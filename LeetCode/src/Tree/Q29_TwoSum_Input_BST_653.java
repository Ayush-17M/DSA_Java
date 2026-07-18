package Tree;

import java.util.*;

public class Q29_TwoSum_Input_BST_653 {
    HashSet<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }

        int val = k - root.val; //   9 - 5 = 4
        if(set.contains(val)){ // 4 are present in set
            return true;
        }

        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
