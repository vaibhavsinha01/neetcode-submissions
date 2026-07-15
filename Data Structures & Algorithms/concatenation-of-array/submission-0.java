class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            num[i] = nums[i];
        }
        for(int i=nums.length;i<nums.length*2;i++){
            num[i] = nums[i-nums.length];
        }
        return num;
    }
}