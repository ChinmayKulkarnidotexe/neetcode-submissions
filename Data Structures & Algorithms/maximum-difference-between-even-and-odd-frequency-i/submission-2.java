class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (freq[i] % 2 == 1 && freq[j] % 2 == 0 && freq[j] != 0) {
                    result = Math.max(result, freq[i] - freq[j]);
                }
            }
        }
        return result;
    }
}