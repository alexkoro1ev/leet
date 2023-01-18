package easy.symmetric_tree;

import java.util.*;

public class Solution {
    public boolean isSymmetric(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node.left);
        stack.push(node.right);

        while (!stack.isEmpty()) {
            TreeNode treeNode1 = stack.pop();
            TreeNode treeNode2 = stack.pop();

            if (treeNode1 == null && treeNode2 == null) {
                continue;
            }

            if (treeNode1 == null || treeNode2 == null || treeNode1.val != treeNode2.val) {
                return false;
            }

            stack.push(treeNode1.left);
            stack.push(treeNode2.right);
            stack.push(treeNode1.right);
            stack.push(treeNode2.left);
        }

        return true;
    }
}
