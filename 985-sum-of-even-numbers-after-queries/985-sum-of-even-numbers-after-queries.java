class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int l=nums.length,r=queries.length;
        int s=0;
        for(int j=0;j<l;j++)
            if((nums[j]&1)==0)
                s+=nums[j];
        int[] arr=new int[r];
        for(int i=0;i<r;i++){
            int x=queries[i][1];
            if((nums[x]&1)==0)
                s-=nums[x];
            nums[x]+=queries[i][0];
            if((nums[x]&1)==0)
                s+=nums[x];
            arr[i]=s;
        }
        return arr;
    }
}