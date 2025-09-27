class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = fruits.length;
        
        for(int fruit : fruits){
            for(int i=0; i<baskets.length; i++){
                if(fruit <= baskets[i]){
                    count--;
                    baskets[i] = -1;
                    break;
                }
            }
        }

        return count;
    }
}