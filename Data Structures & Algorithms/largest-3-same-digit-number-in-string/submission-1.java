class Solution {
    public String largestGoodInteger(String num) {
        String largest = "";
        int n = num.length();
        for (int i = 0; i < n - 2; i++) {
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i + 1);
            char ch3 = num.charAt(i + 2);
            if (ch1 == ch2 && ch2 == ch3) {
                if (largest.isEmpty()) largest = num.substring(i, i + 3);
                else if (largest.charAt(0) < ch1) largest = num.substring(i, i + 3);
            }
        }
        return largest;
    }
}