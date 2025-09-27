class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i =0; i<m+n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }
            else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }

        while(j>=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
        

}

// Time Complexity : O(m + n)
// Space Complexity = O(1)


// TestCase:
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]