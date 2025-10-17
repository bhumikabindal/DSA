class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int flag=1;
for(int j=0;j<n;j++){

    if(nums[j]==i){
flag=0;
break;
    }
}

if(flag==1){
    return i;
}
        }
   return -1; }
}