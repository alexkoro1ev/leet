package easy.running_sum_of_1d_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1, 2, 3, 4}))); // [1, 3, 6, 10]
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1, 1, 1, 1, 1}))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(solution.runningSum(new int[]{3, 1, 2, 10, 1}))); // [3, 4, 6, 16, 17]
    }
}
