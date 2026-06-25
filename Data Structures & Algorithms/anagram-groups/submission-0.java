class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> mp = new HashMap<>();
        for(String uns : strs){
            char[] unc = uns.toCharArray();
            Arrays.sort(unc);
            String temp = new String(unc);
            if(!mp.containsKey(temp)){
                mp.put(temp, new ArrayList<>());
                mp.get(temp).add(uns);
            }
            else{
                mp.get(temp).add(uns);
            }
        }
        List<List<String>> ans = new ArrayList<>(mp.values());
        return ans;
    }
}
