class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int c=0;
        int left=0;
        for(int i=k;i<arr.length;i++)
        {
            if(sum/k >=threshold) c++;
            sum+=arr[i]-arr[left++];
            
        }
        if(sum/k>=threshold) c++;
        return c;

        
    }
}