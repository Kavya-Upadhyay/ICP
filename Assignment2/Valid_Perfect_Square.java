class Solution {
    public boolean isPerfectSquare(int num) {

        if(num ==0 || num == 1){
            return true;
        }

        int start = 2;
        int end = num;
        while(start <= end){
            int mid = start+(end-start)/2;
            long sqr = (long)mid*mid;

            if(sqr == num){
                return true;
            }

            else if(sqr > num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
        
    }
}

// Time Complexity : n(logn)
// Space Complexity : O(1)

// test case:
// Input: num = 16
// Output: true