class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer w1=new StringBuffer();
        StringBuffer w2=new StringBuffer();
        for(String s:word1)
            w1.append(s);
        for(String s:word2)
            w2.append(s);
        return w1.toString().equals(w2.toString());
    }
}