class Solution {
    public int lengthOfLongestSubstring(String s) {
         int maxString=0;
        int left =0, right =1;
        while(left<s.length()){

            HashSet<Character> set = new HashSet<>();
            //Add the first left character
            set.add(s.charAt(left));
            while(right<s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            maxString = Math.max(maxString,set.size());
            left++;
            right = left+1;
        }
        return maxString;
    }
}
