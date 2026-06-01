class Solution {
    public int[] twoSum(int[] numbers, int target) {
      Map<Integer,Integer> set = new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            if(set.containsKey(target-numbers[i]) ){
                  return new int[]{set.get(target-numbers[i])+1,i+1};
            }else {
                set.put(numbers[i], i);
            }
        }
        return new int[]{1,1};
    }
}
