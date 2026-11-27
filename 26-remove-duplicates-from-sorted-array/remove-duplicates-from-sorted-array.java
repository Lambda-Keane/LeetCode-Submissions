class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 1;
        int count = 1;
        while (right < nums.length) {
            if (nums[right] != nums[left]) {
                count++;
                nums[++left] = nums[right];
            }
            right++;
        }
        return count;
    }
}