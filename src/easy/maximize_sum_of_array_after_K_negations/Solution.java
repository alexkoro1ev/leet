package easy.maximize_sum_of_array_after_K_negations;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Solution {
    public int largestSumAfterKNegations(int[] ints, int i) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.stream(ints).boxed().toList());

        IntStream.range(0, i).forEach(n -> queue.offer(-queue.poll()));

        return queue.stream().reduce(0, (a, b) -> a + b);
    }
}
