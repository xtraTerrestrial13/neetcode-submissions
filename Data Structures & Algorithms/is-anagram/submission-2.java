class Solution {
     public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        int[] countTable = new int[26];
        for(int i = 0; i<s.length();i++){
            countTable[s.charAt(i)-'a']++;
            countTable[t.charAt(i)-'a']--;
        }
        //used j for better readability
        for (int j : countTable) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
