class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,target,0,0);        
    }
    public int backtrack(int[] nums,int target,int idx,int sum)
    {
        if(idx==nums.length)
        {
            return sum==target?1:0;
        }
        int np=backtrack(nums,target,idx+1,sum-nums[idx]);
        int p=backtrack(nums,target,idx+1,sum+nums[idx]);
        return np+p;
    }
}