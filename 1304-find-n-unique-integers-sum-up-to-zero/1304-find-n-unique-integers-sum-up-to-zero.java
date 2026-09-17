class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0;
        // Add pairs: 1,-1, 2,-2, ...
        for (int i = 1; i <= n / 2; i++) {
            arr[index] = i;
            index = index + 1;
            arr[index] = -i;
            index = index + 1;
        }
        // If n is odd, add 0
        if (n % 2 != 0) {
            arr[index] = 0;
        }
        return arr;
    }
}