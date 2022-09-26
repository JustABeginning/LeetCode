class Solution {
    private int[] id, sz;

    public boolean equationsPossible(String[] equations) {
        // WQUPC
        id = new int[26];
        sz = new int[26];
        for (int i = 0; i < 26; i++) {
            id[i] = i;
            sz[i] = 1;
        }
        for (String s : equations) {
            if (s.charAt(1) == '=') {
                int p = s.charAt(0) - 'a';
                int q = s.charAt(3) - 'a';
                union(p, q);
            }
        }
        for (String s : equations) {
            if (s.charAt(1) == '!') {
                int p = s.charAt(0) - 'a';
                int q = s.charAt(3) - 'a';
                if (connected(p, q))
                    return false;

            }
        }
        return true;
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private void union(int p, int q) {
        int i = root(p), j = root(q);
        if (i == j)
            return;
        if (sz[i] >= sz[j]) {
            id[j] = i;
            sz[i] += sz[j];
        } else {
            id[i] = j;
            sz[j] += sz[i];
        }
    }
}
