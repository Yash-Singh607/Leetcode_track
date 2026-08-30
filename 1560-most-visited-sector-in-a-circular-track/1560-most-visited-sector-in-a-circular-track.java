class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        ArrayList<Integer> list = new ArrayList<>();
        // start <= end → start to end
        // start > end → start to n + 1 to end
        if (start <= end) {
            // Direct path: start to end
            for (int i = start; i <= end; i++) {
                list.add(i);
            }
        } else {
            // Circular path: 1 to end, then start to n
            for (int i = 1; i <= end; i++) {
                list.add(i);
            }
            for (int i = start; i <= n; i++) {
                list.add(i);
            }
        }
        return list;
    }
}