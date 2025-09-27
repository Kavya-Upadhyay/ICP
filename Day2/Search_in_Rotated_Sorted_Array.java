class Solution {
    public int search(int[] nums, int target) {
        int pivot = peakIndex(nums);
        if(pivot == -1){
            return BinarySearch(nums, target, 0, nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        else if(nums[0] <= target){
            return BinarySearch(nums, target,0, pivot);
        }

        else{
            return BinarySearch(nums,target, pivot+1, nums.length-1);
        }


    }

    static int peakIndex(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            else if(arr[mid]>arr[start]){
                start=mid+1;
            }

            else{
                end = mid-1;
            }
        }

        return -1;
    }

    public static int BinarySearch(int[] arr,int target, int start, int end){
        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                end = mid-1;
            }

            else{
                start = mid+1;
            }
        }
        return -1;
    }
}