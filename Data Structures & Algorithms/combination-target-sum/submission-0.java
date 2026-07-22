class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums,0,target,current,result,0,n);
        return result;
    }
    public void backtrack(int[] nums,int index,int target,List<Integer> current,List<List<Integer>> result,int sum,int n){
        // base condition
        if(sum > target){
            return;
        }
        if(sum == target){
            result.add(new ArrayList<>(current));
        }
        for(int i=index;i<n;i++){
            current.add(nums[i]);
            sum += nums[i];
            backtrack(nums,i,target,current,result,sum,n);
            current.remove(current.size()-1);
            sum -= nums[i];
        }
    }
}
