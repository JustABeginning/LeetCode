class Solution {
    public String longestCommonPrefix(String[] strs) {
        int p = 0, n = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() <= n) {
                n = strs[i].length();
                p = i;
            }
        }
        String st = strs[p];
        StringBuffer pref = new StringBuffer();
        outer: for (int i = 0; i < n; i++) {
            char ch = st.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (j == p)
                    continue;
                else if (strs[j].charAt(i) != ch)
                    break outer;
            }
            pref.append(ch);
        }
        return pref.toString();
    }
}
