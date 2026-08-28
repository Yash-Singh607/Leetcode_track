class Solution {
    public int[][] largestLocal(int[][] grid) {
        int nRows = grid.length;
        int nCols = grid[0].length;
        // Result size is 2 less because each cell represents a 3x3 area
        int[][] result = new int[nRows - 2][nCols - 2];
        // Consider every possible 3x3 window
        for (int row = 0; row < nRows - 2; row++) {
            for (int col = 0; col < nCols - 2; col++) {
                // Find the maximum value inside the current 3x3 window
                result[row][col] = findLargest(grid, row, col);
            }
        }
        return result;
    }
    // Finds the largest value in the 3x3 sub-matrix
    private int findLargest(int[][] grid, int row, int col) {
        int best = grid[row][col];
        // Traverse the current 3x3 window
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                // Keep track of the maximum value
                best = Math.max(best, grid[i][j]);
            }
        }
        return best;
    }
}