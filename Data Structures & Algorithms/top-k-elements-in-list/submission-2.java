class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int x : nums){
            if(!mp.containsKey(x)){
                mp.put(x,1);
            }
            else{
                mp.put(x, mp.get(x)+1 );
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> value = new ArrayList<>(mp.entrySet());
        value.sort(Map.Entry.comparingByValue());
        Map<Integer, Integer> smp = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer>  e : value){
            smp.put(e.getKey(), e.getValue());
        }
        List<Integer> ordered = new ArrayList<>(smp.keySet());
        Collections.reverse(ordered);

        for(int x = 0; x<k; x++){
            ans.add(ordered.get(x));
        }

        int[] res = new int[ans.size()];
        
        for(int i = 0; i<ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
