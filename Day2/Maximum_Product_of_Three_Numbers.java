class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first_three = nums[0]*nums[1]*nums[n-1];
        int last_three = nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(first_three,last_three);
        
    }
}