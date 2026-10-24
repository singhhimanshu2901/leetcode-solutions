class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            if(nums[i+1]-nums[i]==0)
                return nums[i];
        }
        return 0;
    }
}