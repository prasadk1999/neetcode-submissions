class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxWater = 0;
        while(left <= right){
            int minHeight = Math.min(heights[left], heights[right]);
            int area = (right - left) * minHeight ;
            if(area > maxWater)
                maxWater = area;

            if(minHeight == heights[left])
                left++;
            else if(minHeight == heights[right])
                right--;
        }

        return maxWater;
    }
}
