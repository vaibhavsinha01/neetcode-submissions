class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // create a hashmap 
        // create a priorityqueue
        // find the largest k elements and return them
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> hm.get(a) - hm.get(b));
        for(int num:hm.keySet()){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] res = new int[k]; 
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }
        
        return res;
    }
}
