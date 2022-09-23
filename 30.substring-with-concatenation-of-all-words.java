import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    private int n, d;

    public List<Integer> findSubstring(String s, String[] words) {
        n = words.length;
        d = words[0].length();
        Arrays.sort(words);
        int i = 0, skp = n * d, j = i + skp;
        List<Integer> ans = new ArrayList<Integer>();
        while (j <= s.length()) {
            String t = s.substring(i, j);
            if (isPermute(t, words))
                ans.add(i);
            i++;
            j = i + skp;
        }
        return ans;
    }

    private boolean isPermute(String s, String[] arr) {
        String[] tmp = new String[n];
        int i = 0, j = i + d, k = 0;
        while (j <= s.length()) {
            tmp[k++] = s.substring(i, j);
            i = j;
            j = i + d;
        }
        Arrays.sort(tmp);
        return Arrays.equals(tmp, arr);
    }
}
