class Solution {
    public String reverseWords(String s) {
        s=s.trim().concat(" ");
        List<String> stl=new ArrayList<String>();
        for(int i=0,k=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(i>k)
                    stl.add(s.substring(k,i));
                k=i+1;
            }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=stl.size()-1;i>=0;i--){
            sb.append(stl.get(i));
            if(i>0)
                sb.append(" ");
        }
        return sb.toString();
    }
}