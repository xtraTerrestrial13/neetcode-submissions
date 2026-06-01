class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int i =0, j=numbers.length-1;
        while (i<j){
            if(target == numbers[i] + numbers[j]){
                return new int[]{i+1,j+1};
            }
            if(target > numbers[i] + numbers[j]){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{1,1};  
    }
}
