class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
                count++;
            }
        }
        return count;
    }
}