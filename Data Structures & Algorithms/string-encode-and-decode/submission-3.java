class Solution {

    public String encode(List<String> strs) {
        String newStr = "";
        for(String x: strs){
            String len = String.valueOf(x.length());
            newStr = newStr + String.join("#", len, x);
        }
        return newStr;

    }

    public List<String> decode(String str) {
        List<String> message = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j + 1, j + 1 + len);
            message.add(word);
            i = j + 1 + len;
        }
        return message;

    }
}
