class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int result = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        //dp[i] = dp[i - 1] + nums[i]; (dp[i - 1] > 0)
        //dp[i] = nums[i]; (dp[i - 1] < 0)
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] >= 0){
                dp[i] = dp[i - 1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
            //nums[i] += Math.max(nums[i - 1], 0);
            //result = Math.max(result, nums[i]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
