class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for(int i=0; i<prices.length; i++){
        //     for(int j=i+1; j<prices.length; j++){
        //         int soldPrice = prices[j] - prices[i];
        //         if(soldPrice > maxProfit){
        //             maxProfit = soldPrice;
        //         }
        //     }
        // }
        // return maxProfit;
        

        int bprice = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(bprice<prices[i]){
                profit = Math.max(profit, prices[i]-bprice);
            }
            else{
                bprice = prices[i];
            }
        }
        return profit;
    }
}