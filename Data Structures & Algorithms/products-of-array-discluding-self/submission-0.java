class Solution {
  

    public int[] productExceptSelf(int[] nums) {
 //Find Product of all numbers
        int[] prefixArray = new int[nums.length];
        int product = 1;
        prefixArray[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            product = nums[i - 1] * product;
            prefixArray[i] = product;
        }
        int totalPostfix = 1;
        for(int i = nums.length-1; i >= 0; i--){
            prefixArray[i] = prefixArray[i] * totalPostfix;
            totalPostfix = nums[i]* totalPostfix;
        }
        return prefixArray;
    }
}  
