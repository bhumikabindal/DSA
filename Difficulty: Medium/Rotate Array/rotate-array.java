// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        // to handle cases when d > n
        d = d % n;
        //NGEH

        // Step 1: store first d elements in a temp array
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Step 3: copy temp elements back to the end
        int j = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j++];
        }
    }
}
