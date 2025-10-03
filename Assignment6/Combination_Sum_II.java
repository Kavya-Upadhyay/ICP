// Time Complexity:O(2^target)
// Space Complexity: O(target * 2^target)

// Test Case:
// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: 
// [
// [1,1,6],
// [1,2,5],
// [1,7],
// [2,6]
// ]

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] counter = new int[51];
        for (int i = 0; i < candidates.length; i++) {
            counter[candidates[i]]++;
        }

        List<List<Integer>> result = new ArrayList<>();
        backtrack(target,result, new ArrayList<>(), counter, 1);
        return result;
    }
    public void backtrack(int target, List<List<Integer>> result, List<Integer> currList, int[] counter, int candidate) {
        if (target == 0) {
            result.add(new ArrayList<>(currList));
            return;
        }
        for (int nextCandidate = candidate; nextCandidate <= 30; nextCandidate++) {
            int nextTarget = target - nextCandidate;
            if (counter[nextCandidate] > 0 && nextTarget >= 0) {
                currList.add(nextCandidate);
                counter[nextCandidate]--;
                backtrack(nextTarget, result, currList, counter, nextCandidate);
                counter[nextCandidate]++;
                currList.remove(currList.size() - 1);
            }
        }
    }
}