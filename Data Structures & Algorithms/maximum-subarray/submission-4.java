class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        if(nums.length == 1){
            sum = nums[0];
            return sum;
        }
        
        for(int i = 0; i < nums.length; i++){
            int tempSum = nums[i];
            if(tempSum > sum)
                sum = tempSum;
            for(int j = i+1; j < nums.length; j++){
                tempSum += nums[j];
                if(tempSum > sum)
                    sum = tempSum;
            }
            if(tempSum > sum)
                sum = tempSum;
        }
        return sum;
    }
}
