class Solution {
  public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> remainderPositionMap = new HashMap<>();
        //Constraints only 1 pair per input
        

        int secondElement = 0;
        int firstElementIndex = 0;

        //Note: This only works if, there is guaranteed one pair of the indices.
        //If there isn't one, this solution will return [0,0]
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
