/*  Given: Array of int, sorted in non-decreasing order
    Ask: return 2 numbers, such that:
        - they add up to the target
        - num1 < num2
        - num1 != num2
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0, right=numbers.length-1;
        int[] resArr = new int[2];
        while(left < right){
            int num1 = numbers[left];
            int num2 = numbers[right];

            if(num1 == num2)
                right--;
            else if((num1+num2) > target)
                right--;
            else if((num1+num2) < target)
                left++;
            else{
                resArr[0] = left+1;
                resArr[1] = right+1;
    
                return resArr;
            }
        }
        return resArr;
    }
}
