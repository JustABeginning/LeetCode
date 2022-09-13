class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=-1,j=-1,n=numbers.length;
        for(i=0;i<n;i++){
            j=binSearch(numbers,i+1,target-numbers[i]);
            if(j!=-1)
                break;
        }
        i++;
        j++;
        int[] ret=new int[2];
        ret[0]=(int)Math.min(i,j);
        ret[1]=(int)Math.max(i,j);
        return ret;
    }
    public int binSearch(int[] arr,int l,int x){
        int f=-1,m=-1,u=arr.length-1;
        while(l<=u){
            m=(l+u)/2;
            if(x>arr[m])
                l=m+1;
            else if(x<arr[m])
                u=m-1;
            else{
                f=m;
                break;
            }
        }
        return f;
    }
}