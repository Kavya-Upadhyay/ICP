class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,max=0;
        int[] freq=new int[128];
        while(right<s.length())
        {
            char ch=s.charAt(right);
            freq[ch]++;
            while(freq[ch]>1)
            {
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
        
    }
}