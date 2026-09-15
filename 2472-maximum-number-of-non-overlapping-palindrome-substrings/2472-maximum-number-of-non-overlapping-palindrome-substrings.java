class Solution {  
    public int maxPalindromes(String s, int k) {  
        int n = s.length();  
        // For k = 1, every character is a palindrome
        if (k == 1)  
            return n;  
        int res = 0;  
        // i = starting index
        for (int i = 0; i <= n - k; i++) {  
            // Check palindrome of length k
            // Last index = i + k - 1
            if (check(s, i, i + k - 1)) {  
                res++;  
                // Skip k characters
                // i += k-1 + loop's i++ = k
                i += k - 1;  
            }  
            // If length k fails, check length k+1
            // Last index = i + k
            // Length = (i+k) - i + 1 = k+1
            else if (i < n - k && check(s, i, i + k)) {  
                res++;  
                // Skip k+1 characters
                // i += k + loop's i++ = k+1
                i += k;  
            }  
        }  
        return res;  
    }  
    // Check palindrome using two pointers
    boolean check(String s, int l, int r) {  
        for (; l < r; l++, r--) {  
            if (s.charAt(l) != s.charAt(r))  
                return false;  
        }  
        return true;  
    }  
}