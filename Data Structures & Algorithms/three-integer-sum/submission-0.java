class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
           
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                for (int k=j+1; k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        result.add(integers);
                    }
                }
            }
        }

        return new ArrayList<>(result);


      
    }
}
