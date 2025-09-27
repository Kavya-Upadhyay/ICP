class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int pile : piles){
            if(max<pile){
                max = pile;
            }
        }
        int ans = -1;
        int s = 1;
        int e = max;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(isvalid(piles, mid, h)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }

        return ans;
    }

    static boolean isvalid(int[] piles, int mid, int h){
        int sum = 0;
        for(int pile : piles){
            sum += Math.ceil(pile/(double)mid);
        }
        if(sum<=h){
            return true;
        }
        return false;
    }
}