class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]%2;
        }
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k)) c+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
        
    }
}