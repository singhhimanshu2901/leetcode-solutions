class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            int s1 = 0;
            int s2 = 0;
            for(int j=0 ; j<i ; j++){
                s1 += nums[j];
            }
            for(int j=i+1 ; j<n ; j++){
                s2 += nums[j];
            }
            if(s1==s2)
                return i;
        }
        return -1;
    }
}