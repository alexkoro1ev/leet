package easy.merge_two_binary_trees;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode first = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode second = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode result = solution.mergeTrees(first, second);
        System.out.println("Done");
    }
}
