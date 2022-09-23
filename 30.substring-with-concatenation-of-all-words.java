class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        List<String> set = new ArrayList<String>();
        for (int k = 0; k < words.length; k++)
            set.add(words[k]);
        Collections.sort(set);
        int i = 0, d = words[0].length(), skp = words.length * d, j = i + skp;
        List<Integer> ans = new ArrayList<Integer>();
        while (j <= s.length()) {
            String t = s.substring(i, j);
            if (isPermute(t, d, set))
                ans.add(i);
            i++;
            j = i + skp;
        }
        return ans;
    }

    private boolean isPermute(String s, int d, List<String> st) {
        List<String> ts = new ArrayList<String>();
        int i = 0, j = i + d;
        while (j <= s.length()) {
            ts.add(s.substring(i, j));
            i = j;
            j = i + d;
        }
        Collections.sort(ts);
        return ts.equals(st);
    }
}
