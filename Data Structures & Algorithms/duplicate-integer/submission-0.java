class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> travNums = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(travNums.containsKey(nums[i]))
                return true;
            
            travNums.put(nums[i], i);
        }

        return false;
    }
}