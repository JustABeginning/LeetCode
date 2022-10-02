import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int[] tmp=new int[l];
        int[] ret=new int[2];
        System.arraycopy(nums,0,tmp,0,l);
        Arrays.sort(tmp);
        int i=0,j=l-1;
        while(i<=j){
            int s=tmp[i]+tmp[j];
            if(s==target)
                break;
            else if(s<target)
                i++;
            else
                j--;
        }
        ret[0]=find(nums,-1,tmp[i]);
        ret[1]=find(nums,ret[0],tmp[j]);
        return ret;
    }
    private int find(int[] arr,int j,int x){
        int f=-1,l=arr.length;
        for(int i=0;i<l;i++){
            if(i!=j&&arr[i]==x){
                f=i;
                break;
            }
        }
        return f;
    }
}