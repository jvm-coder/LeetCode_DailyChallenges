class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length-2;i++) {
            int l=i+1;
            int r=nums.length-1;
            
            while(l<r) {
                int sum = nums[i]+nums[l]+nums[r];
                int diff = Math.abs(sum-target);
                
                if(diff == 0)
                    return sum;
                else if(diff<minDiff) {
                    minDiff = diff;
                    maxSum = sum;
                }
                
                if(sum < target)
                    ++l;
                else
                    --r;
            }
        }
        return maxSum;
    }
}
