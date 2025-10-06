class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int c=0,sum=0;
        for(int[] row:boxTypes)
        {
            if(c+row[0]<=truckSize)
            {
                c+=row[0];
                sum+=row[0]*row[1];
            }
            
            else{
                sum+=(truckSize-c)*row[1];
                break;
            }
        }
        return sum;

        
    }
}