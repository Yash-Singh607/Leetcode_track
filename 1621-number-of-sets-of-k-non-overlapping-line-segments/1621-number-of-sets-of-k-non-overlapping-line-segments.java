class Solution {
    static final int MOD = 1000000007;
    static final int LIMIT = 1999;
    static long[] factorial = new long[LIMIT];
    static long[] inverseFactorial = new long[LIMIT];
    static {
        factorial[0] = 1;
        for (int number = 1; number < LIMIT; number++)
            factorial[number] = factorial[number - 1] * number % MOD;
        inverseFactorial[LIMIT - 1] =
            power(factorial[LIMIT - 1], MOD - 2);
        for (int number = LIMIT - 1; number > 0; number--)
            inverseFactorial[number - 1] =
                inverseFactorial[number] * number % MOD;
    }
    private static long power(long base, int exponent) {
        long result = 1;
        for (; exponent > 0; exponent /= 2) {
            if (exponent % 2 > 0)
                result = result * base % MOD;
            base = base * base % MOD;
        }
        return result;
    }
    private long combination(int n, int r) {
        return factorial[n] * inverseFactorial[r] % MOD
                * inverseFactorial[n - r] % MOD;
    }
    public int numberOfSets(int n, int k) {
        return (int) combination(n + k - 1, k * 2);
    }
}