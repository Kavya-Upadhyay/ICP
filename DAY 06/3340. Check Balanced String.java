class Solution {
    public boolean isBalanced(String num) {
        int sumEven=0,sumOdd=0,a=0;
        for(char ch:num.toCharArray())
        {
            if(a%2==0)
            {
                sumEven+=ch-'0';
            }
            else
            {
                sumOdd+=ch-'0';
            }
            a++;
        }
        return sumEven==sumOdd;
        
    }
}