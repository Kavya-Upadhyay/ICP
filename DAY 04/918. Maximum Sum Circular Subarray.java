class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tempMaxSum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int total=0;
        int tempMinSum=0;
        for(int num:nums)
        {
            total+=num;
            tempMaxSum+=num;
            maxSum=maxSum<tempMaxSum?tempMaxSum:maxSum;
            tempMaxSum=tempMaxSum<0?0:tempMaxSum;
            tempMinSum+=num;
            minSum=minSum>tempMinSum?tempMinSum:minSum;
            tempMinSum=tempMinSum>0?0:tempMinSum;
        }
        if(total==minSum) return maxSum;
        return Math.max(maxSum,total-minSum);
    }
}