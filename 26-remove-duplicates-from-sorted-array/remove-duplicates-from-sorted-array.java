class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1, right = 1;
        int count = 1;
        int lastSeen = nums[0];
        while (right < nums.length) {
            if (nums[right] != lastSeen) {
                count++;
                nums[left++] = nums[right];
                lastSeen = nums[right];
            }
            right++;
        }
        return count;
    }
}