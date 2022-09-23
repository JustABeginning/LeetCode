class Solution {
    public String longestPalindrome(String s) {
        int l=s.length();
        if(l>1){
            int low,high,n,maxL=1,start=0;
            for(int i=0;i<l;i++){
                low=i-1;
                high=i+1;
                while(low>=0&&s.charAt(low)==s.charAt(i))
                    low--;
                while(high<l&&s.charAt(high)==s.charAt(i))
                    high++;
                while((low>=0&&high<l)&&s.charAt(low)==s.charAt(high)){
                    low--;
                    high++;
                }
                n=high-low-1;
                if(n>maxL){
                    maxL=n;
                    start=low+1;
                }
            }
            return s.substring(start,start+maxL);
        }
        else
            return s;
    }
}