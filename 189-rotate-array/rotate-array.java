class Solution {
    public void rotate(int[] nums, int k) {
        //brute force
        int n = nums.length;
        k = k % n;
        // int temp[] = new int[k];
        // int i;
        // for (i = n - k; i < n; i++) {
        //     temp[i - (n - k)] = nums[i];
        // }
        // // Shifting
        // for (i = n - k - 1; i >= 0; i--) {
        //     nums[i + k] = nums[i];
        // }
        // for (i = 0; i < k; i++) {
        //     nums[i] = temp[i];
        //optimal
        
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        }
        static void reverse(int nums[],int start,int end){
            while(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
    }