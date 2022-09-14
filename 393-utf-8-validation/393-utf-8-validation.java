class Solution {
    public boolean validUtf8(int[] data) {
        return checkValid(data,0);
    }
    public int getLength(int d){
        if((d>>7)==0)
            return 1;
        else if((d>>5)==6)
            return 2;
        else if((d>>4)==14)
            return 3;
        else if((d>>3)==30)
            return 4;
        else
            return 0;
    }
    public boolean checkValid(int[] arr,int x){
        boolean res=false;
        int n=getLength(arr[x]);
        if(n>0){
            int l=arr.length,r=n+x,c=0;
            int m=(r<=l)?r:l;
            for(int i=x+1;i<m;i++){
                if((arr[i]>>6)==2)
                    c++;
                else
                    break;
            }
            //System.out.println("n = "+n+", c = "+c);
            if(n==(c+1)){
                res=true;
                if(r<l){
                    //System.out.println("SUB, r = "+r+", arr[r] = "+arr[r]);
                    res=checkValid(arr,r);
                }
            }
        }
        return res;
    }
}