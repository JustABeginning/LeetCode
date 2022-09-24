class Solution {
    public double myPow(double x, int n) {
        if(n>=0)
            return powf(x,n);
        else
            return 1/powf(x,n);
    }
    private double powf(double x,long n){
        long m=Math.abs(n);
        double res=1;
        while(m>0){
            if((m&1)==1)
                res=res*x;
            x*=x;
            m=m>>1;
        }
        return res;
    }
}