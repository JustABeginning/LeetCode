class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int j=0,i=0;j<nums.length;j++){
            if(map.containsKey(nums[j])){
                i=map.get(nums[j]);
                if((j-i)<=k)
                    return true;
                else
                    map.put(nums[j],j);
            }
            else
                map.put(nums[j],j);
        }
        return false;
    }
}