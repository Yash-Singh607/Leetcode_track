class Solution {
public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    // rec1 is completely to the left of rec2
    // rec1 is completely to the right of rec2
    // rec1 is completely below rec2
    // rec1 is completely above rec2
    if (rec1[2] <= rec2[0] ||
        rec1[0] >= rec2[2] ||
        rec1[3] <= rec2[1] ||
        rec1[1] >= rec2[3]) {
        return false;
    }
    return true;
}
}
