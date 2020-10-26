class Solution {
    public int maxSubArray(int[] nums) {
        int fmax=nums[0];
        int gmax=nums[0];

        for(int i=1;i<nums.length;i++){
            fmax=Math.max(nums[i],nums[i]+fmax);
            gmax=Math.max(fmax,gmax);
        }
        return gmax;
    }
}
