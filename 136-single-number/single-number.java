class Solution {
    
    public int singleNumber(int[] nums) {
        //brute 
      
        int n=nums.length;
        for(int i=0;i<n;i++){
            int element=nums[i];
  int count =0;
for(int j=0;j<n;j++){
    if(nums[j]==element){
        count++;
    }
}
if(count==1){
return element;
}
        }
 return -1 ;  }
}