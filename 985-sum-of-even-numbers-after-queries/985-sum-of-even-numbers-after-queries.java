import java.util.HashMap;
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int l=nums.length,r=queries.length;
        int s=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int j=0;j<l;j++){
            if((nums[j]&1)==0){
                s+=nums[j];
                map.put(j,nums[j]);
            }
        }
        int[] arr=new int[r];
        for(int i=0;i<r;i++){
            int x=queries[i][1];
            nums[x]+=queries[i][0];
            int y=nums[x];
            if(map.containsKey(x)){
                s-=map.get(x);
                map.remove(x);
            }
            if((y&1)==0){
                s+=y;
                map.put(x,y);
            }
            arr[i]=s;
        }
        return arr;
    }
}