class Solution {
    public int maxProfit(int[] prices) {

        int lowest_price = Integer.MAX_VALUE;
        int profit = 0;
        int ans = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i] < lowest_price){
                lowest_price = prices[i];
            }
            profit = prices[i] - lowest_price;
            if(ans < profit){
                ans = profit;
            }
        }
        return ans;
    }
}
