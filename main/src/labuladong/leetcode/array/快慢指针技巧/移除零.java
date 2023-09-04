package labuladong.leetcode.array.快慢指针技巧;

public class 移除零 {
    void moveZeroes(int[] nums) {
        int show = 0, quick = 0;
        while (quick < nums.length) {
            if (nums[quick] != 0) {
                nums[show] = nums[quick];
                show++;
            }
            quick++;
        }
        for (int i = show ; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
