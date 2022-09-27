class Solution {
    public String pushDominoes(String dominoes) {
        int l = dominoes.length();
        char[] arr = dominoes.toCharArray();
        int[] forces = new int[l];
        int force = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 'R')
                force = l;
            else if (arr[i] == 'L')
                force = 0;
            else
                force = Math.max(force - 1, 0);
            forces[i] = force;

        }
        force = 0;
        for (int i = l - 1; i >= 0; i--) {
            if (arr[i] == 'L')
                force = l;
            else if (arr[i] == 'R')
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
