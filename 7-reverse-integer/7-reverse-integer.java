class Solution {
    public int reverse(int x){
        long r=0;
        if(x<0){
            int n=-x;
            r=-revNum(n);
        }
        else
            r=revNum(x);
        if(r<Integer.MIN_VALUE||r>Integer.MAX_VALUE)
            r=0;
        return (int)r;
    }
    public long revNum(int n){
        long r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
}