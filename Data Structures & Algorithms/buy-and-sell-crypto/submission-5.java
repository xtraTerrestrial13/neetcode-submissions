class Solution {
    public int maxProfit(int[] prices) {

    int maxProfit =0;

            //negative then ignore - how about, i add the previous one.


            int l =0, r=1;
            while(r<prices.length){
                if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                   maxProfit=Math.max(maxProfit,profit);
                }else{
                    l=r;
                }
                    r++;
            }

            return maxProfit;

    }    
    
}
