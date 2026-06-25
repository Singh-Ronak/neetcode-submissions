class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            if(!mp.containsKey(x)){
                mp.put(x,1);
            }
            else{
                mp.put(x, mp.get(x)+1 );
            }
        }
        for(int x : mp.values()){
            if(x>1){
                return true;
            }
        }
        return false;
    }
}