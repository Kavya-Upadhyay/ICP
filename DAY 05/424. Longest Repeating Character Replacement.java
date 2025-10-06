class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0,maxfreq=0,max=0;
        for(int right=0;right<s.length();right++)
        {
            int j=s.charAt(right)-'A';
            freq[j]++;
            maxfreq=Math.max(maxfreq,freq[j]);
            while((right-left+1)-maxfreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
        
    }
}