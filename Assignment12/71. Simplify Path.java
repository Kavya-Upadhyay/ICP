class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String>st=new Stack<>();
        for(String p:parts)
        {
            if(p.equals("")||p.equals(".")) continue;
            else if(p.equals(".."))
            {
                if(!st.isEmpty()) st.pop();
            }
            else st.push(p);
        }
        StringBuilder sb=new StringBuilder();
        for(String p:st) sb.append("/").append(p);
        return sb.length()==0?"/":sb.toString();
    }
}