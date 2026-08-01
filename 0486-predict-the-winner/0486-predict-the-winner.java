class Solution {
    public boolean predictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1, 0, 0, true);
    }
// You may assume that both players are playing optimally. this is main point why player 2 also wants to win
    private boolean helper(int[] nums, int left, int right,int p1, int p2, boolean p1turn) {
        if (left > right) {
            return p1 >= p2;
        }
        if (p1turn) {
            //Player 1 chooses the better move.
            return helper(nums, left + 1, right, p1 + nums[left], p2, false)
                || helper(nums, left, right - 1, p1 + nums[right], p2, false);
        } else {
            //Player 2 chooses the move that hurts Player 1 the most.
            return helper(nums, left + 1, right, p1, p2 + nums[left], true)
                && helper(nums, left, right - 1, p1, p2 + nums[right], true);
        }
    }
}