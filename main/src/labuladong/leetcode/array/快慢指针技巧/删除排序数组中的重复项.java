package labuladong.leetcode.array.快慢指针技巧;

public class 删除排序数组中的重复项 {
    int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int show = 0, quick = 0;
        while (quick < nums.length) {
            if (nums[show] != nums[quick]) {
                show++;
                nums[show] = nums[quick];
            }
            quick++;
        }
        return show + 1;
    }
}
