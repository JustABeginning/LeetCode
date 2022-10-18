class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        else{
            StringBuffer sb=new StringBuffer("1");
            sb=csay(n,sb);
            return sb.toString();
        }
    }
    private StringBuffer csay(int n,StringBuffer sb){
        if(n==1)
            return sb;
        else
            return csay(n-1,encode(sb));
    }
    private StringBuffer encode(StringBuffer st){
        StringBuffer res=new StringBuffer();
        char cp,ch;
        ch=cp=st.charAt(0);
        int i,c;
        i=c=0;
        while(i<st.length()){
            ch=st.charAt(i);
            if(ch==cp){
                c++;
                i++;
            }
            else{
                res.append(c);
                res.append(cp);
                cp=ch;
                c=0;
            }
        }
        res.append(c);
        res.append(cp);
        return res;
    }
}