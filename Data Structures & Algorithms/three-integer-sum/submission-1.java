class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalArr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int firstNum = nums[i];
            int j = i + 1, k = nums.length - 1;
            while(j<k){
                int tempSum = nums[i] + nums[j] + nums[k];
                if(tempSum == 0){
                    finalArr.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                     // Skip duplicates
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;k--;
                }
                else if(tempSum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return finalArr;
    }
}