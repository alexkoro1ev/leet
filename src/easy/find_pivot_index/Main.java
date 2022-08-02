package easy.find_pivot_index;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{1, 7, 3, 6 ,5, 6})); // 3
        System.out.println(solution.pivotIndex(new int[]{1, 2, 3})); // -1
        System.out.println(solution.pivotIndex(new int[]{2, 1, -1})); // 0
    }
}
