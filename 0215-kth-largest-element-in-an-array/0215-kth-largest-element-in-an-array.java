class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        a = nums[nums.length-k];
        return a;
    }
}