class Solution {
    public String convertToTitle(int columnNumber) {
        String st="";
        int i;
        for(i=columnNumber;i>26;i/=26){
            int d=i%26;
            if(d==0){
                d=26;
                i-=26;
            }
            st=(char)(64+d)+st;
        }
        st=(char)(64+i)+st;
        return st;
    }
}