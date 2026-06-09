class Solution {
    public int characterReplacement(String s, int k) {
        // k charcter can be replaced.
        // k can be zero.


        //Hashmap.
        //count MaxFrequency 
        // Formula - > window - maxFrequency <= k (Substring)
    
        
        int result = 0; 
        
        int left =0, maxF=0;
        HashMap<Character,Integer> countMap = new HashMap<>();

        for(int right =0 ;right<s.length();right++){
            char ch = s.charAt(right);
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
            maxF = Math.max(maxF,countMap.get(ch));
            
            while(right-left+1 - maxF > k){
                char chl= s.charAt(left);
                countMap.put(chl,countMap.get(chl)-1);
                left ++;
            }
            result = Math.max(result,right - left +1);
        }
        return result; 

        
    }
}
