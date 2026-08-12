class Solution {
    public int maxDistToClosest(int[] seats) {

        // Index of the last person we found
        int last = -1;

        // Stores the maximum distance found so far
        int ans = 0;

        // Traverse the seats from left to right
        for (int i = 0; i < seats.length; i++) {

            // If there is a person at index i
            if (seats[i] == 1) {

                // This is the first person we have found
                if (last == -1) {

                    // All empty seats before this person
                    // have their closest person at index i
                    ans = i;

                } else {

                    // There is a person at 'last' and another at 'i'
                    // Alex can sit in the middle of these two people
                    // so the maximum distance is (i - last) / 2
                    ans = Math.max(ans, (i - last) / 2);
                }

                // Update last to the current person's position
                last = i;
            }
        }

        // Check the empty seats after the last person
        // The farthest seat is the last seat: seats.length - 1
        ans = Math.max(ans, seats.length - 1 - last);

        return ans;
    }
}