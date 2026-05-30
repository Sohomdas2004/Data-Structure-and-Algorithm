class Solution:
    def maxProfit(self, prices):
        # code here
        start=0
        end=1
        profit=0
        curProfit=0
        
        while(end<len(prices)):
            if(prices[start]>prices[end]):
                start=end
            curProfit=prices[end]-prices[start]
            profit=max(profit,curProfit)
            end+=1
            
        return profit