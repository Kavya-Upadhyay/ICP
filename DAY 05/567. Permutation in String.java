class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        if(m>n) return false;
        int[] s1c=new int[26];
        int[] s2c=new int[26];
        for(char ch:s1.toCharArray()) s1c[ch-'a']++;
        for(int i=0;i<m;i++) s2c[s2.charAt(i)-'a']++;
        if(match(s1c,s2c)) return true;
        for(int i=m;i<n;i++)
        {
            s2c[s2.charAt(i)-'a']++;
            s2c[s2.charAt(i-m)-'a']--;
            if(match(s1c,s2c)) return true;
        }
        return false;
        }
        public boolean match(int[] s1c,int[] s2c)
        {
            for(int i=0;i<26;i++)
            {
                if(s1c[i]!=s2c[i]) return false;
            }
            return true;
        }
}
