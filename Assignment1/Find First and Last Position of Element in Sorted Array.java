class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind1=firstIdx(nums,target);
        int ind2=secondIdx(nums,target);
        int[] arr={ind1,ind2};
        return arr;
        
    }
    public int firstIdx(int[] nums,int target)
    {
        int idx=-1;
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                idx=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return idx;
    }
    public int secondIdx(int[] nums,int target)
    {
        int idx=-1;
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                idx=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return idx;
    }
}
