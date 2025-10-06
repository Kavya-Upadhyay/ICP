class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        long high=position[n-1];
        long ans=0;
        long low=1;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(isPossible(position,mid,m))
            {
               low=mid+1;
               ans=mid; 
            }
            else{
                high=mid-1;
            }
        }
        return (int)ans;
        
    }
    public boolean isPossible(int[] pos,long m,long k)
    {
        long last=pos[0];
        int c=1;
        for(int i=1;i<pos.length;i++)
        {
            if(pos[i]-last>=m)
            {
                last=pos[i];
                c++;
                if(c==k) return true;

            }
        }
        return c>=k;
    }
}