class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String res="";
        for(int i=0;i<arr.length;i++)
            res+=reverse(arr[i])+" ";
        return res.trim();
    }
    private String reverse(String s){
        return new StringBuffer(s).reverse().toString();
    }
}