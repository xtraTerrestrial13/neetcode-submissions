class Solution {


        public boolean checkInclusion(String s1, String s2) {

            //s1 has same characters as substring of s2.
            // All characters should be equal count.
            // Fixed window sliding

            //Brute force -> Store all fixed windows of s2 and then compare with s1.

            // Sort s1 & s2 -> Iterate and match substring.

            // Optimisation lies in compare functions, how to compare.
            // HashMap of strings and then compare character count?


            //Constrainsts - only lowercase characters
            // boolean - so find and return true on the first one.

            // then i can use a count array of 1, and compare it with count array of 2. If all 26 matches,
            //return true

            int left= 0, right = s1.length();

            int[] a1 = new int[26];
            for(int i =0;i < s1.length(); i++){
                a1[s1.charAt(i) - 'a']++;
            }



            while(right<=s2.length()){
                String sub =  s2.substring(left,right);
                int[] a2 = new int[26];

                for(int i = 0 ; i < sub.length(); i++){
                    a2[sub.charAt(i) - 'a']++;
                }
                if(compareArrayOfSameSize(a1,a2)){
                    return true;
                }
                left++; right++;
            }
            return false;
        }


        public boolean compareArrayOfSameSize(int[] a1, int[] a2){
            for(int i =0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    return false;
                }
            }
            return true;
        }
}
