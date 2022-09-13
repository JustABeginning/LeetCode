class Solution {
    public int titleToNumber(String columnTitle) {
        int l = columnTitle.length() - 1, colNum = 0;
        char ch;
        for (int i = l; i >= 0; i--) {
            ch = columnTitle.charAt(i);
            colNum += (int) Math.pow(26, l - i) * (ch - 64);
        }
        return colNum;
    }
}