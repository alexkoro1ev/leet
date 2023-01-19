package easy.maximize_sum_of_array_after_K_negations;


/**
 * Given an integer array nums and an integer k, modify the array in the following way:
 ** choose an index i and replace nums[i] with -nums[i].
 * <p>
 * You should apply this process exactly k times. You may choose the same index i multiple times.
 * <p>
 * Return the largest possible sum of the array after modifying it in this way.
 */

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));          // 5
        System.out.println(solution.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));      // 6
        System.out.println(solution.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));  // 13
    }
}
