package easy.range_sum_of_bst;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();

            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }

            if (treeNode.val >= low && treeNode.val <= high) {
                sum += treeNode.val;
            }
        }

        return sum;
    }
}