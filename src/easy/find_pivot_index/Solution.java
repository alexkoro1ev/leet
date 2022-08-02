package easy.find_pivot_index;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        int equality = 0;
        for (int i = 0; i < nums.length; i++) {
            if (equality * 2 == sum - nums[i]) {
                return i;
            }

            equality += nums[i];
        }

        return -1;
    }
}
