// TimeComplexity:	O(n + target)	
// Space zcomplexity: 	O(target)

// Test case:
// Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]

// Output: 3


package Assignment10;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float arraytime[] = new float[target+1],max=0;
        for(int i=0;i<position.length;i++){
            arraytime[position[i]] = (float)(target-position[i])/speed[i];
        }
        int count=0;
        for(int i=target;i>=0;i--){
            if(arraytime[i]>max){
                count++;
                max=arraytime[i];
            }
        }
        return count;
    }
}
