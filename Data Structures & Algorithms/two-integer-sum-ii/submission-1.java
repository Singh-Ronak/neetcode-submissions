class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i<numbers.length; i++){
            int diff = target-numbers[i];
            if(!mp.containsKey(diff)){
                mp.put(numbers[i], i);
            }
            else{
                if(mp.get(diff)<i){
                    ans[0] = mp.get(diff)+1;
                    ans[1] = i+1;
                }
            }
        }
        return ans;
    }
}
