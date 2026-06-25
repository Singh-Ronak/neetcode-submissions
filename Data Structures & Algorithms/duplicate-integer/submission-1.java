class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            if(!mp.containsKey(x)){
                mp.put(x,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}