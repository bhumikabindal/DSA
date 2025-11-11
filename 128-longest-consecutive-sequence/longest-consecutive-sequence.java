class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        int n=nums.length;
        int count=0;
        int longest=Integer.MIN_VALUE;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        
     for(int it: set){
        if(!set.contains(it-1)){
            count=1;

int x=it;
while(set.contains(x+1)){
    count++;
    x++;
}

        }
    longest=Math.max(longest,count);
     }
   return longest; }
}