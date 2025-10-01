class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        long prev = Long.MIN_VALUE;
       
        int ans = 0;
        for(int i = 0; i< points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
           
            if(prev < x){
                
                ans ++;
                prev = y;
            }
        }
        return ans;
    }
}