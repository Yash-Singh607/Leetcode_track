class Solution {
    public int getSum(int a, int b) {
        // When there is no carry left, a contains the final answer
        if (b == 0)
            return a;
        // XOR gives addition without considering carry
        int sum = a ^ b;
        // AND finds the carry, then shift left to move it to the next bit
        int carry = (a & b) << 1;
        // Repeat with the new sum and carry
        return getSum(sum, carry);
    }
}

/*
Example: a = 5, b = 3

    5 = 0101
    3 = 0011
1. Sum without carry:
   0101 ^ 0011 = 0110 = 6

2. Find carry:
   0101 & 0011 = 0001
   0001 << 1  = 0010 = 2

3. Repeat:
   6 ^ 2 = 4
   (6 & 2) << 1 = 4

4. Repeat:
   4 ^ 4 = 0
   (4 & 4) << 1 = 8

5. Repeat:
   0 ^ 8 = 8
   carry = 0

Answer = 8

Remember:
XOR (^) → Sum without carry
AND (&) → Find carry
<< 1    → Move carry to next bit
*/