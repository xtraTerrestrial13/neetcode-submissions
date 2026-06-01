class Solution {
     public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> remainderPositionMap = new HashMap<>();
        //Constraints only 1 pair per input
        for(int i = 0;i< nums.length;i ++){
            if(remainderPositionMap.containsKey(target-nums[i])){
              return  new int[]{remainderPositionMap.get(target-nums[i]),i};
            }
            remainderPositionMap.put(nums[i],i);
        }

        return new int[]{};
    }
}
