/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bfs(nums, 0, mid - 1);
        root.right = bfs(nums, mid+1, nums.length - 1);
        return root;
    }
    private TreeNode bfs(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = lo + (hi - lo)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bfs(nums, lo, mid - 1);
        node.right = bfs(nums, mid+1, hi);
        return node;
    }
}