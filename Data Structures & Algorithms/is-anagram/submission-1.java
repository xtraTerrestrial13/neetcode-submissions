class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        Map<Character, Integer> hashTable = new HashMap<>();

        for (i = 0; i < s.length(); i++) {
            if (hashTable.containsKey(s.charAt(i))) {
                hashTable.put(s.charAt(i), hashTable.get(s.charAt(i)) + 1);
            } else {
                hashTable.put(s.charAt(i), 0);
            }
        }

         for (j = 0; j < t.length(); j++) {
            
            if (!hashTable.containsKey(t.charAt(j))) {
                return false;
            }else{
                Integer remaining = hashTable.get(t.charAt(j));
                if(remaining <= 0){
                    hashTable.remove(t.charAt(j));
                }else{
                    hashTable.put(t.charAt(j),remaining-1);
                }
            }
        }


        return true;
    }


}
