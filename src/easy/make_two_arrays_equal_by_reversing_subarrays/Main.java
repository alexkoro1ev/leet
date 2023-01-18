package easy.make_two_arrays_equal_by_reversing_subarrays;

/**
 You are given two integer arrays of equal length target and arr.
 In one step, you can select any non-empty subarray of arr and reverse it.
 You are allowed to make any number of steps.

 Return true if you can make arr equal to target or false otherwise.
 */

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canBeEqual(new int[]{1, 2, 3 ,4}, new int[]{2, 4, 1, 3}));  // true
        System.out.println(solution.canBeEqual(new int[]{7}, new int[]{7}));                    // true
        System.out.println(solution.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}));       // false
    }
}
