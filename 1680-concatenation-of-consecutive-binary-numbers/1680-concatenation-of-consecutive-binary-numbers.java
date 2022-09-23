class Solution {
    public int concatenatedBinary(int n) {
        final long m=1000000007;
        long res=0;
        int d=0;
        for(int i=1;i<=n;i++){
            d=((i&(i-1))==0)?(d+1):d;
            res=((res<<d)+i)%m;
        }
        return (int)res;
    }
}