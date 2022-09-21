class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int l=nums.length,r=queries.length;
        int s=0;
        for(int j=0;j<l;j++)
            if((nums[j]&1)==0)
                s+=nums[j];
        int[] arr=new int[r];
        for(int i=0;i<r;i++){
            if((nums[queries[i][1]]&1)==0)
                s-=nums[queries[i][1]];
            nums[queries[i][1]]+=queries[i][0];
            if((nums[queries[i][1]]&1)==0)
                s+=nums[queries[i][1]];
            arr[i]=s;
        }
        return arr;
    }
}