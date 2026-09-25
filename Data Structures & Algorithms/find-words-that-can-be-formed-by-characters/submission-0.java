class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int result = 0;
        for (String word : words) {
            int freq2[] = new int[26];
            boolean isGood = true;
            for (char ch : word.toCharArray()) {
                freq2[ch - 'a']++;
                if (freq2[ch - 'a'] > freq[ch - 'a']) { isGood = false; break; }
            }
            if (isGood) { 
                result += word.length();
            }
        }
        return result;
    }
}