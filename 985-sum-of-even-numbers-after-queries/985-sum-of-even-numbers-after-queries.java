class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int l=nums.length,r=queries.length;
        int[] arr=new int[r];
        for(int i=0;i<r;i++){
            nums[queries[i][1]]+=queries[i][0];
            int s=0;
            for(int j=0;j<l;j++)
                if((nums[j]&1)==0)
                    s+=nums[j];
            arr[i]=s;
        }
        return arr;
    }
}