class Solution {
    public int characterReplacement(String s, int k) {
        int l =0 , r=0, maxF=0, res =0;
        Map<Character,Integer> count = new HashMap<>();

        //two character can be replaced.
        // one maxF // max C // max frequency
        while(r<s.length()){
            char ch = s.charAt(r);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            maxF=Math.max(maxF,count.get(ch));
            //Reducing window when k > sizeOfWindow - MaxFrequency
            while((r-l+1) - maxF > k){
                char chl= s.charAt(l);
                count.put(chl,count.get(chl)-1);
                l++;
            }
            res= Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}
