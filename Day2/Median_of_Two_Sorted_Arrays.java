class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged =new int[n1+n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                merged[k] = nums1[i];
                
                i++; 
            }
            else{
                merged[k] = nums2[j];
                
                j++;
            }
            k++;
        }

        while(j<n2){
            merged[k] = nums2[j];
            j++;
            k++;
        }

        while(i<n1){
            merged[k] = nums1[i];
            i++;
            k++;
        }

        return median(merged);
    }

    static double median(int[] arr){
        int n = arr.length; 
        if(n%2==0){
            double m = arr[n/2] + arr[n/2 - 1];
            return m/2;
        }
        else{
            return arr[n/2];
        }
    }
}


// Time Complexity = O(n1 + n2)