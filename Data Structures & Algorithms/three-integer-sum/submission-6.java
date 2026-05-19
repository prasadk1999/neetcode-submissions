/*
Task: In a integer array, find all distinct triplets whose sum = 0 and indices are unique

Steps:
- Sort the array in ascending order
- Loop the array, get the first number, ignore the loop if the number is same as the previous one
- Assign two pointers: left=first_number_index+1, right = array.size - 1
- create a loop between left and right
- check if sum of firstNum+num[left]+num[right]  = 0. If so, add the array to the final array
- if not, check if the sum > 0. If so, decrement right by 1
- If not, check if the sum < 0. If so, increment left by 1
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalArr =  new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i <nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    var sumArr = new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right]));
                    //if (finalArr.contains(sumArr)){
                        finalArr.add(sumArr);
                    //}
                    right--; left++;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(sum > 0) right --;
                else if(sum < 0) left++;
            }
        }

        return finalArr;
    }
}
