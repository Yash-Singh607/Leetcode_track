class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{nums[i], sum(nums[i]), i});
        }
        list.sort((a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || list.get(i)[2] == i) continue;
            int j = i;
            int cycle = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = list.get(j)[2];
                cycle++;
            }
            swaps += cycle - 1;
        }
        return swaps;
    }
    public int sum(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}