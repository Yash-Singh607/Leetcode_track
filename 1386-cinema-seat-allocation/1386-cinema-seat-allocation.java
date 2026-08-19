class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        // Store reserved seats row by row
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int seatNumber = seat[1];
            // If row is not present, create a new set
            if (!map.containsKey(row)) {
                map.put(row, new HashSet<>());
            }
            // Add the reserved seat to that row
            map.get(row).add(seatNumber);
        }
        // Rows without reservations can fit 2 groups
        int ans = (n - map.size()) * 2;
        // Check rows that have reservations
        for (Set<Integer> seats : map.values()) {
            boolean left = true;    // Seats 2-5
            boolean middle = true;  // Seats 4-7
            boolean right = true;   // Seats 6-9
            // Check left block
            for (int i = 2; i <= 5; i++) {
                if (seats.contains(i)) {
                    left = false;
                }
            }
            // Check middle block
            for (int i = 4; i <= 7; i++) {
                if (seats.contains(i)) {
                    middle = false;
                }
            }
            // Check right block
            for (int i = 6; i <= 9; i++) {
                if (seats.contains(i)) {
                    right = false;
                }
            }
            // Left and right can both be used
            if (left && right) {
                ans += 2;
            }
            // At least one block can be used
            else if (left || middle || right) {
                ans++;
            }
        }
        return ans;
    }
}