class Solution {
    public int romanToInt(String s) {
        char ch, cp = Character.MIN_VALUE;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            if (isSmall(ch, cp))
                sum -= getRoman(ch);
            else
                sum += getRoman(ch);
            cp = ch;
        }
        return sum;
    }

    public int getRoman(char ch) {
        int n;
        if (ch == 'I')
            n = 1;
        else if (ch == 'V')
            n = 5;
        else if (ch == 'X')
            n = 10;
        else if (ch == 'L')
            n = 50;
        else if (ch == 'C')
            n = 100;
        else if (ch == 'D')
            n = 500;
        else if (ch == 'M')
            n = 1000;
        else
            n = 0;
        return n;
    }

    public boolean isSmall(char ch, char cp) {
        return getRoman(ch) < getRoman(cp);
    }
}
