package src;

public class Solution {

    public int search(int[] nums, int target) {
        int min = minSearch(nums);

        // search in right sorted part
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        } 
        // search in left sorted part
        else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

    // Binary Search
    public int binarySearch(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = l + (r - l) / 2;   // FIXED

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // Find index of minimum element (pivot)
    public int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}