class Solution {
    public int[] twoSum(int[] nums, int target) {
                int[] result = new int[]{0, 0};
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numberMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (numberMap.containsKey(target - nums[i])&& i != numberMap.get(target - nums[i])  ) {
                result[0] = i;
                result[1] = numberMap.get(target - nums[i]);
                break;
            }
        }
        return result;

    }
}
