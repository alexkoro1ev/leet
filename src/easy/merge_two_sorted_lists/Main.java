package easy.merge_two_sorted_lists;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(1, new ListNode(3, new ListNode(4)))
        ));
    }
}
