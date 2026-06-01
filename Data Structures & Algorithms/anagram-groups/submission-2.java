class Solution {
  
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> mapOfStrings = new HashMap<>();

        //Iterate over the strings and create a string for it, on the A-Z array.
        for(String str : strs){
            String hashKey = hashKey(str);
            if(mapOfStrings.containsKey(hashKey)){
                mapOfStrings.get(hashKey).add(str);
                continue;
            }
           List<String> list =new ArrayList<>();
            list.add(str);
            mapOfStrings.put(hashKey,list);
        }

        for(Map.Entry<String,List<String>> entry : mapOfStrings.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }

    public String hashKey(String str){
        int[] num = new int[26];

        for(int i =0 ; i<str.length();i++){
            num[str.charAt(i)-'a']++;
        }
        String result = "";
        for(int j = 0; j<26;j++){
            if(num[j]>0){
                result = result + num[j] + (char) ('a' + j);
            }
        }
        return result;
    }
}
