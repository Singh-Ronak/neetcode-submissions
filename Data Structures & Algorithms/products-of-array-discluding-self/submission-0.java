class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();
        int pre_prod = 1;
        prefix.add(0,pre_prod);
        for(int i = 1; i<nums.length; i++){
            pre_prod = pre_prod * nums[i-1];
            prefix.add(i,pre_prod);
        }
        for(int i = 0; i<nums.length; i++){
            suffix.add(1);
        }
        int suff_prod = 1;
        suffix.set(nums.length-1,suff_prod);
        for(int i = nums.length-2; i>=0; i--){
            suff_prod = suff_prod *nums[i+1];
            suffix.set(i,suff_prod);
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = prefix.get(i)*suffix.get(i);
        }
        return ans;


    }
}  
