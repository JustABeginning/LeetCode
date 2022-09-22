class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int l=s.length();
        if(l>1){
            int skp=1;
            int i=0,j=i+skp;
            while(j<=l){
                while(j<=l){
                    String t=s.substring(i,j);
                    int n=t.length();
                    if(isPalin(t)&&n>res.length()){
                        res=t;
                        skp=n;
                    }
                    j++;
                }
                i++;
                j=i+skp;
            }
        }
        else
            res=s;
        return res;
    }
    private boolean isPalin(String s){
        boolean res=true;
        int l=s.length(),m=l/2;
        for(int i=0;i<m;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){
                res=false;
                break;
            }
        }
        return res;
    }
}