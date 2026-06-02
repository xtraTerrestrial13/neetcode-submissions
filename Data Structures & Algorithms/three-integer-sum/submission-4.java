class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]>0) break;

            int j=i+1, k = nums.length - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}
