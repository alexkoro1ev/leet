package easy.make_two_arrays_equal_by_reversing_subarrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        Map<Integer, Long> s = Arrays.stream(target)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        Map<Integer, Long> d = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        return s.equals(d);
    }
}