package binarySearch;

/**
 * 搜索插入位置
 */
public class BinaryInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums,2));
        ;
    }
    public static int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
    public static int search(int[] nums, int l, int r, int target) {

        if (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return search(nums, l, mid - 1, target);
            } else {
                return search(nums, mid + 1, r, target);
            }
        }
        if (nums[l] < target) {
            return l+1;
        } else {
            return l ;
        }
        //0 3 1 3
        //0 0
    }
}
