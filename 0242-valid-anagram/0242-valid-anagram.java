class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        return Arrays.equals(c, c1);
    }
}