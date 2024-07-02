package org.example;

public class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        int left = 0;
        int maxf = 0;
        int[] alpha = new int[26];
        for (int right = 0; right < s.length() && left < s.length(); right++) {
            alpha[s.charAt(right) - 'A']++;
            maxf = Math.max(maxf, alpha[s.charAt(right) - 'A']);
            if (right - left + 1 - maxf <= k) {
                result = Math.max(result, right - left + 1);
            } else {
                alpha[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return result;
    }
}
