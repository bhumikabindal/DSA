import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                // Only add if it's not duplicate in result
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        System.out.println(sol.intersection(arr1, arr2)); // Output: [2, 3]
    }
}
