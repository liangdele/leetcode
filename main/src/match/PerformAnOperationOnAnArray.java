package match;

/**
 * 对数组执行操作：2460
 */
public class PerformAnOperationOnAnArray {
    public static void main(String[] args) {

    }

    private int[] performAnOperationOnAnArray(int[] nums) {
        int len = nums.length;
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (nums[j] == 0) {
                continue;
            } else {
                if (j < len - 1 && nums[j] == nums[j + 1]) {
                    nums[j + 1] = 0;
                    nums[j] *= 2;
                }
                nums[i] = nums[j];
                i++;
            }
        }
        // 末尾补0
        while (i < len) {
            nums[i] = 0;
            i++;
        }
        return nums;
    }
}
