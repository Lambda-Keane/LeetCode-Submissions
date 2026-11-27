class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char c;
        while (i < 200) {
            if (strs[0].length() == i) return sb.toString();
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != c) return sb.toString();
            }
            sb.append(c);
            i++;
        }
        return sb.toString();
    }
}