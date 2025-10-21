// Time Complexity: O(n₁ × n₂)
// Space Complexity: O(n₂)

// test case
// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]

package Assignment10;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int [nums1.length];
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        int ans=-1;
        for(int i=0;i<nums1.length;i++){
            int idx=map.get(nums1[i]);
            for(int j=idx;j<nums2.length;j++){
                 ans=-1;
                if(nums2[j]>nums1[i]){
                    ans=nums2[j];
                    break;
                }
            }
            res[i]=ans;
        }
        return res;
        
    }
}
