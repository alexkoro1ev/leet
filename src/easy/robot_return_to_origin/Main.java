package easy.robot_return_to_origin;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.judgeCircle("UD")); // true
        System.out.println(solution.judgeCircle("LR")); // true
        System.out.println(solution.judgeCircle("LL")); // false
        System.out.println(solution.judgeCircle("LLRR")); // true
    }

}
