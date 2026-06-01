class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        //Create a number and It's frequency Map
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for(int num:nums){
            if(numberFrequencyMap.containsKey(num)){
                numberFrequencyMap.replace(num, numberFrequencyMap.get(num) + 1);
            }else{
                numberFrequencyMap.put(num,1);
            }
        }

        //Now take the list of keys and create an Array Of List<Integers> for each possible number
        List<Integer>[] frequencyIntegerArray = new List[nums.length + 1];

        for (int i = 0; i < frequencyIntegerArray.length; i++) {
            frequencyIntegerArray[i] = new ArrayList<>();
        }


        for(Map.Entry<Integer,Integer> entry : numberFrequencyMap.entrySet()){
            frequencyIntegerArray[entry.getValue()].add(entry.getKey());
        }

        int topK=0;
        for(int i = frequencyIntegerArray.length-1; i>0 && k>0; i--){
            if(!frequencyIntegerArray[i].isEmpty()){
                for (Integer integer : frequencyIntegerArray[i]) {
                    res[topK++]= integer;
                    if(topK>=k){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
