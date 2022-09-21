class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int[] arr=new int[l];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        double m;
        if((l&1)==0){
            l=l/2;
            m=(arr[l]+arr[l-1])/2.0;
        }
        else{
            l=(l+1)/2;
            m=arr[l-1];
        }
        return m;
    }
}