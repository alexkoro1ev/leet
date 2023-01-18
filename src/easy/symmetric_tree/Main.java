package easy.symmetric_tree;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * Example1: [1, 2, 2, 3, 4, 4, 3]
 *          1
 *      2   |   2
 *    3   4 | 4   3
 * Output: true
 *
 * Example2: [1, 2, 2, null, 3, null, 3]
 *          1
 *      2   |   2
 *        3 |     3
 * Output: false
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        TreeNode test1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))); // true
        TreeNode test2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))); // false
        System.out.println(solution.isSymmetric(test1));
        System.out.println(solution.isSymmetric(test2));
    }
}
