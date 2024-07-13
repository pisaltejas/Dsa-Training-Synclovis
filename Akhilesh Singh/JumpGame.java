public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame game = new JumpGame();
        int[] input = {2, 3, 1, 1, 4};
        System.out.println(game.canJump(input)); // Output: True
    }
}
