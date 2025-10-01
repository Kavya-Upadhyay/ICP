// Time complexity: O(N)

// Test case:
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6


class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length<=0) return -1;

        int start=0;
        int max=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0) k--;
            while(k<0){
                if(nums[start]==0)k++;
                start++;
            }
            max = Math.max(max,end-start+1);
        }    
    
        return max;
    }
}