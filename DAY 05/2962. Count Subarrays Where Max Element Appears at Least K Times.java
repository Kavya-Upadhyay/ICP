class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) maxNum = Math.max(maxNum, num);
        int c = 0, left = 0;
        long ans = 0;
        int n = nums.length;
        for (int right = 0; right < n; right++) {
            if (nums[right] == maxNum) c++;
            while (c >= k) {
                ans += n - right;
                if (nums[left] == maxNum) c--;
                left++;
            }
        }
        return ans;
    }
}
