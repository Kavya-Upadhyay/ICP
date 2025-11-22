class Solution {
    public String decodeString(String s) {
        Stack<Integer>st1=new Stack<>();
        Stack<StringBuilder>st2=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)) num=num*10+(ch-'0');
            else if(ch=='[')
            {
                st1.push(num);
                st2.push(sb);
                sb=new StringBuilder();
                num=0;
            }
            else if(ch==']')
            {
                int r=st1.pop();
                StringBuilder prev=st2.pop();
                for(int j=0;j<r;j++) prev.append(sb);
                sb=prev;
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}