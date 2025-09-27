class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] res = new int[2];
        res[0] = BinaryFirstSearch(nums,target);
        res[1] = BinarySecondSearch(nums, target);

        return res;
        
    }

    static int BinaryFirstSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int firstIndex = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                firstIndex = mid;
                end = mid-1;
            }

            else if(arr[mid] < target){
                start = mid+1;

            }

            else{
                end = mid-1;
            }
        }

        return firstIndex;
    }

    static int BinarySecondSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int lastIndex = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                lastIndex = mid;
                start = mid+1;
            }

            else if(arr[mid] < target){
                start = mid+1;

            }

            else{
                end = mid-1;
            }
        }

        return lastIndex;
    }
}