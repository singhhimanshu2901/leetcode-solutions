class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1];
        for(int i=0 ; i<n1 ; i++){
            int res = -1;
            for(int j=0 ; j<n2 ; j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j ; k<n2 ; k++){
                        if(nums2[k]>nums2[j]){
                            res = nums2[k];
                            break;
                        }
                    }
                }
            }
            arr[i] = res;
        }
        return arr;
    }
}