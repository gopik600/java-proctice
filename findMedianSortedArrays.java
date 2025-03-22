class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int c1=m+n;
        int[] arr=new int[c1];

        System.arraycopy(nums1,0,arr,0,m);
        System.arraycopy(nums2,0,arr,m,n);
         
         Arrays.sort(arr);
        if(c1%2!=0){
            return arr[c1/2];
        }
        else
        {
            return (arr[(c1-1)/2] + arr[c1/2])/2.0;
        }
        
    }
}
