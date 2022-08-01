package easy.robot_return_to_origin;

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (Character c : moves.toCharArray()) {
            switch (c) {
                case 'U' -> y--;
                case 'D' -> y++;
                case 'L' -> x--;
                case 'R' -> x++;
            }
        }

        return x == 0 && y == 0;
    }
}
