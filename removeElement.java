class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Index to place non-val elements

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != val) {
                nums[index] = nums[k];
                index++;
            }
        }

        return index;
    }
}
