package sort;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch(nums, 9));
    }

    public static int binarySearch(int[] nums, int target) {

        return search(nums, 0, nums.length - 1, target);
    }

    public static int search(int[] nums, int left, int right, int target) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return search(nums, mid + 1, right, target);
            } else {
                return search(nums, left, mid - 1, target);

            }
        }

        return -1;
    }

}
