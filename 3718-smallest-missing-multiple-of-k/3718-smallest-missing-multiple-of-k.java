class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j=1;
        while(true){
            int c=0;
            int m = k*j;
            for(int i=0 ; i<nums.length ; i++){
                if(nums[i]==m)
                    c++;
            }
            if(c==0)
                return m;
            else
                j++;
        }
    }
}