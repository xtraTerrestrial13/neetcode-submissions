class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(int n : nums){
            if(integerSet.contains(n)){
                return true;
            }else{
                integerSet.add(n);
            }
        }
        return false;
    }
}
