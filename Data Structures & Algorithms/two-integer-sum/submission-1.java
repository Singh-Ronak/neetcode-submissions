class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int diff = 0;
        int[] ans = new int[2];
        for(int x = 0; x<nums.length; x++){
            diff = target - nums[x];
            
            if(!mp.containsKey(diff)){
                mp.put(nums[x], x);
            }
            else{
                ans[0] = mp.get(diff);
                ans[1] = x;
            }
        }
        return ans;
    }
}
