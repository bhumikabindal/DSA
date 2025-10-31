// User function Template for Java
import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Create a map to store prefix sum and its first occurrence index
        Map<Long, Integer> prefixMap = new HashMap<>();
        
        int maxLen = 0;     // To store the maximum length of subarray
        long sum = 0;       // To store prefix sum
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Update prefix sum

            // Case 1: if the sum itself equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: check if a prefix sum (sum - k) exists
            long rem = sum - k;
            if (prefixMap.containsKey(rem)) {
                int len = i - prefixMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: store prefix sum if not already stored
            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }
        }

        return maxLen;
    }
}

