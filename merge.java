class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s1=nums1.length;
        int s2=nums2.length;
        int nm=m+n;
        int n1=s1+s2;
        int [] arr=new int[n1];

        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        System.arraycopy(arr,0,nums1,0,nm);
        Arrays.sort(nums1);
    }
}
