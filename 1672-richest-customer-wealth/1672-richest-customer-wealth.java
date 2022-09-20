import java.util.Arrays;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length,c=accounts[0].length;
        int[] arr=new int[r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[i]+=accounts[i][j];
        //int max=arr[0];
        //for(int i=1;i<r;i++)
        //    if(arr[i]>max)
        //        max=arr[i];
        Arrays.sort(arr);
        return arr[r-1];
    }
}