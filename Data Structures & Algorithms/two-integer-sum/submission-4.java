class Solution {
  public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> remainderPositionMap = new HashMap<>();
        //Constraints only 1 pair per input

        int secondElement = 0;
        int firstElementIndex = 0;
        for(int i = 0;i< nums.length;i ++){
            if(remainderPositionMap.containsKey(target-nums[i])){
                firstElementIndex=remainderPositionMap.get(target-nums[i]);
                secondElement=i;
                break;
            }
            remainderPositionMap.put(nums[i],i);
        }

        return new int[]{firstElementIndex,secondElement};
    }
}
