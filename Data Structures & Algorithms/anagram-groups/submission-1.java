class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap=new HashMap<>();

        //Is anagram? 
        for (int i=0;i<strs.length;i++){
            int[] arr = new int[26];
            for(int j = 0; j<strs[i].length();j++){
                int characterInt = strs[i].charAt(j) - 'a';
                arr[characterInt]++;
            }
            
            if(anagramMap.containsKey(Arrays.toString(arr))){
                List<String> objects = anagramMap.get(Arrays.toString(arr));
                objects.add(strs[i]);
                anagramMap.put(Arrays.toString(arr),objects);
            }else{
                List<String> objects = new ArrayList<>();
                objects.add(strs[i]);
                anagramMap.put(Arrays.toString(arr),objects);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : anagramMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
