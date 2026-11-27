class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, hi = nums.length - 1;
        int mid = 0;
        while (low <= hi) {
            mid = low + (hi - low)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}