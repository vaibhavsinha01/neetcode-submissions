class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i=0;i<=heights.length;i++){
            int currentHeight = (i==heights.length) ? 0:heights[i];

            while(!stack.isEmpty() && currentHeight<heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek()-1;
                }
                int area = height*width;
                maxArea = Math.max(maxArea,area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}

// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int maxArea = 0;

//         for (int i = 0; i < heights.length; i++) {
//             int minHeight = heights[i];

//             for (int j = i; j < heights.length; j++) {
//                 minHeight = Math.min(minHeight, heights[j]);

//                 int width = j - i + 1;
//                 int area = minHeight * width;

//                 maxArea = Math.max(maxArea, area);
//             }
//         }

//         return maxArea;
//     }
// }
