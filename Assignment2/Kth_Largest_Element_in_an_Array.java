class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++) {
            if(i < k) {
                pq.add(nums[i]);
            } else {
                if(nums[i] > pq.peek()) {
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
    }
}


// Time Complexity : O(nlogk)
// Space Complexity : O(k)

// Test Case:
// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5