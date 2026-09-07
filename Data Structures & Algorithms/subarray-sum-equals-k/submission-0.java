class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer, Integer> arraysum = new HashMap<>();
         arraysum.put(0, 1);
         int sum = 0;
         int seen = 0;

         for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(arraysum.containsKey(sum - k)){
               seen += arraysum.get(sum-k);
            }
            arraysum.put(sum, arraysum.getOrDefault(sum, 0)+ 1);

         }
         return seen;
    }
}