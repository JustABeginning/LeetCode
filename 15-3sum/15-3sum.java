class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set=new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=binSearch(nums,j+1,-(nums[i]+nums[j]));
                if(k<0)
                    continue;
                List<Integer> list=new ArrayList<Integer>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                if(!set.contains(list)){
                    res.add(list);
                    set.add(list);
                }
            }
        }
        return res;
    }
    private int binSearch(int[] arr,int l,int x){
        int f=-1,m=f,u=arr.length-1;
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