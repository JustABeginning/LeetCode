class Solution {
    public int trailingZeroes(int n) {
        int i=5,c=0;
        while(i<=n){
            c+=n/i;
            i*=5;
        }
        return c;
    }
}