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
        // An empty row means no seat is reserved in that row.
        // An empty row can always fit 2 groups.
        // map.size() = number of rows having at least one reserved seat.
        int ans = (n - map.size()) * 2;
        // Check rows that have reserved seats
        for (Set<Integer> seats : map.values()) {
            // Three possible blocks:
            // Left   = seats 2,3,4,5
            // Middle = seats 4,5,6,7
            // Right  = seats 6,7,8,9
            boolean left = true;
            boolean middle = true;
            boolean right = true;
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
            // Left and right do not overlap,
            // so both groups can sit together.
            if (left && right) {
                ans += 2;
            }
            // If at least one block is available,
            // we can place one group.
            else if (left || middle || right) {
                ans++;
            }
            // If no block is available, add nothing.
        }

        return ans;
    }
}