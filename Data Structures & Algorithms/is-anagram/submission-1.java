class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        char[] ct = t.toCharArray();
        Arrays.sort(ct);

        if(Arrays.equals(cs, ct)){
            return true;
        }
        return false;

    }
}
