class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[]ar={target,target};
        int n1=ar.length;
        int[]arr=new int[n1];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]+nums[j])==target){
                   arr[0]=i;
                   arr[1]=j;
                   break;
                }
            }
        }
        
    return arr;}
}
