/*
Steps:
- sort the array in ascending order
- add 2 pointers, left(0th index), right(length-1 index)
-
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int[] resultArr = new int[2];
        //int left = 0, right = nums.length - 1;
        //while(left <= right){
        /*for(int left = 0; left < nums.length; left++){
            for(int right = left+1; right < nums.length; right++){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    resultArr[0] = left;
                    resultArr[1] = right;
                    break;
                }
                //else if(sum > target)
                //    right--;
                //else
                //    left++;
            }
        }
        */

        Map<Integer, Integer> traversedNums = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int required = target - nums[i];
            if(traversedNums.containsKey(required)){
                resultArr[0] = traversedNums.get(required);
                resultArr[1] = i;
            }
            else
                traversedNums.put(nums[i], i);
        }
        return resultArr;
    }
}
