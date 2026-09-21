class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String s : arr) {
            if (freq.containsKey(s)) freq.put(s, -1);
            else freq.put(s, 1);
        }
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                k--;
                    if (k == 0) {
                    return entry.getKey();
                }
            }
        }
        return "";
    }
}