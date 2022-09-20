import java.util.Arrays;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean res = false;
        int lr = ransomNote.length(), lm = magazine.length();
        if (lm >= lr) {
            res = true;
            char[] ran = ransomNote.toCharArray();
            char[] mag = magazine.toCharArray();
            Arrays.sort(ran);
            Arrays.sort(mag);
            String sr = new String(ran);
            String sm = new String(mag);
            int i = 0;
            while (i < lr) {
                char ch = ran[i];
                int countR = sr.lastIndexOf(ch) - i + 1;
                int countM = sm.indexOf(ch);
                if (countM < 0) {
                    res = false;
                    break;
                } else {
                    countM = sm.lastIndexOf(ch) - countM + 1;
                    if (countM < countR) {
                        res = false;
                        break;
                    }
                }
                i += countR;
            }
        }
        return res;
    }
}
