class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int x: nums){
            if(mp.containsKey(x-1)){
                mp.put(x,mp.get(x-1) + 1);
            } 
            else{
                mp.put(x,1);
            }
        }
        int ans = 0;
        for(int y: mp.values()){
            ans = Math.max(ans, y);
        }
        return ans;
    }
}
