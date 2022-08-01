package easy.range_sum_of_bst;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode n18 = new TreeNode(18);
        TreeNode n7 = new TreeNode(7);
        TreeNode n3 = new TreeNode(3);
        TreeNode n15 = new TreeNode(15, null, n18);
        TreeNode n5 = new TreeNode(5, n3, n7);
        TreeNode n10 = new TreeNode(10, n5, n15);

        System.out.println(solution.rangeSumBST(n10, 7, 15));
    }
}
