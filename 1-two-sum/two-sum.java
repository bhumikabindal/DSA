class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();

     

        // 2️⃣ Second pass — check for remainder
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (mpp.containsKey(rem) ) {
                return new int[]{i,mpp.get(rem)};
            }
            mpp.put(nums[i],i);
        }

        return new int[]{};
    }}