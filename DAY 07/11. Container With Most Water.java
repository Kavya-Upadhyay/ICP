class Solution {
    public int maxArea(int[] height) {
        int lft=0;
        int ryt=height.length-1;
        int max=0,cur;
        while(lft<ryt)
        {
            cur=(ryt-lft)*Math.min(height[lft],height[ryt]);
            max=max<cur?cur:max;
            if(height[lft]>height[ryt])
                --ryt;
            else
                ++lft;
        }
        return max;        
    }
}