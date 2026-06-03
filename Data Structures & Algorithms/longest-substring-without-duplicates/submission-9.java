class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         int maxString=0;

        Set<Character> set =new HashSet<>();
        int left =0 , right = 0;
        while(left<s.length() && right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
            }
            maxString = Math.max(maxString,right-left);
        }
        return maxString;
        
    }
}
