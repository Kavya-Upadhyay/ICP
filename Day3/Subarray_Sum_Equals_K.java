class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int cumm = 0;

        for(int i=0; i<nums.length; i++){
            cumm+=nums[i];

            if(map.containsKey(cumm-k)){
                result = result + map.get(cumm-k);
            }

            map.put(cumm, map.getOrDefault(cumm,0)+1);
        }
        return result;
        
    }
}