class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int start = 0; 
        int maxLen = 0; 
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
           
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(start));
                start++;
            }
            
            charSet.add(currentChar);
            
            maxLen = Math.max(maxLen, end - start + 1);
        }
        
        return maxLen;
    }
}
