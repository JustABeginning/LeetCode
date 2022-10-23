class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int[] wspace=new int[l];
        int[] index=new int[l];
        int[] ispace=new int[l];
        int i=0,j=l-1;
        while(i<l)
            index[i]=i++;
        i=0;
        mergeSort(nums,wspace,0,j,index,ispace);
        while(i<=j){
            int s=nums[i]+nums[j];
            if(s==target)
                break;
            else if(s<target)
                i++;
            else
                j--;
        }
        int[] ret=new int[2];
        ret[0]=index[i];
        ret[1]=index[j];
        return ret;
    }
    private void mergeSort(int[] arr,int[] wspace,int l,int u,int[] index,int[] ispace){
        int m=(l+u)/2;
        if(l==u)
            return;
        else{
            mergeSort(arr,wspace,l,m,index,ispace);
            mergeSort(arr,wspace,m+1,u,index,ispace);
            merge(arr,wspace,l,m,u,index,ispace);
        }
    }
    private void merge(int[] arr,int[] wspace,int l,int m,int u,int[] index,int[] ispace){
        int j=0,lp=l,hp=m+1,n=u-l+1;
        while(lp<=m&&hp<=u){
            if(arr[lp]<=arr[hp]){
                wspace[j]=arr[lp];
                ispace[j]=index[lp++];
            }
            else{
                wspace[j]=arr[hp];
                ispace[j]=index[hp++];
            }
            j++;
        }
        while(lp<=m){
            wspace[j]=arr[lp];
            ispace[j]=index[lp++];
            j++;
        }
        while(hp<=u){
            wspace[j]=arr[hp];
            ispace[j]=index[hp++];
            j++;
        }
        for(j=0;j<n;j++){
            arr[l+j]=wspace[j];
            index[l+j]=ispace[j];
        }
    }
}