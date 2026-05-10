public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Code here
        int start,end,profit,curprofit;
        start=0;
        end=1;
        profit=0;
        
        while(end<prices.length){
            if(prices[start]>prices[end]){
                start=end;
            }
            curprofit=prices[end]-prices[start];
            profit=Math.max(profit,curprofit);
            end+=1;
        }
        
        return profit;
    }
}