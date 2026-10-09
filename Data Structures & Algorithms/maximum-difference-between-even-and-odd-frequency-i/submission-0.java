class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                if ((freq[i] % 2) != (freq[j] % 2) && freq[i] != 0 && freq[j] != 0) {
                    result = Math.max(result, Math.abs(freq[i] - freq[j]));
                }
            }
        }
        return result;
    }
}