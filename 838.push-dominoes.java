class Solution {
    public String pushDominoes(String dominoes) {
        int l = dominoes.length();
        int[] forces = new int[l];
        int force = 0;
        for (int i = 0; i < l; i++) {
            char ch = dominoes.charAt(i);
            if (ch == 'R')
                force = l;
            else if (ch == 'L')
                force = 0;
            else
                force = Math.max(force - 1, 0);
            forces[i] = force;

        }
        force = 0;
        for (int i = l - 1; i >= 0; i--) {
            char ch = dominoes.charAt(i);
            if (ch == 'L')
                force = l;
            else if (ch == 'R')
                force = 0;
            else
                force = Math.max(force - 1, 0);
            forces[i] -= force;

        }
        StringBuffer ans = new StringBuffer();
        for (int f : forces)
            ans.append(f > 0 ? 'R' : f < 0 ? 'L' : '.');
        return ans.toString();
    }
}
