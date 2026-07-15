class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0;
        int n = heights.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area = (j-i)*Math.min(heights[i],heights[j]);
                maxarea = Math.max(maxarea,area);
            }
        }
        return maxarea;
    }
}
