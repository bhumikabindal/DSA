class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
           int single=0;
        for(int i=0;i<n;i++){
          single^= nums[i];
        }
   return single; }
}