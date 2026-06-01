class Solution {
        public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int topCount =0;
        for(int n : nums){
            int count =0;
            //Find the start of sequence

            if(set.contains(n-1)){
                continue;
            }

            while(set.contains(n++)){
                count++;
            }
            if(count>topCount){
                topCount=count;
            }
        }


        return topCount;
    }
}
