class Solution {
    public int countArrangement(int n) {
        return backtrack(n,0,new boolean[n+1]);        
    }
    public int backtrack(int n,int idx,boolean[] vis)
    {
        if(idx==n) return 1;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(!vis[i] &&(i%(idx+1)==0 || (idx+1)%i==0))
            {
                vis[i]=true;
                c+=backtrack(n,idx+1,vis);
                vis[i]=false;
            }

        }
        return c;
    }
}