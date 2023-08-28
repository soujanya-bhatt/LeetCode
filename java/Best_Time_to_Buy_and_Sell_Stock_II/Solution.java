class Solution {
    public int maxProfit(int[] prices) {

        int buy = -1, sell = -1;
        int profit = 0;
        for(int i = 0;i<prices.length-1;i++){
            if(prices[i] < prices[i+1] && buy == -1){
                buy += prices[i]+1;
                System.out.println("bought: "+buy);
            } else if(prices[i] > prices[i+1] && buy != -1 ){
                sell += prices[i]+1;
                System.out.println("sold: "+sell);
                profit += sell-buy;
                 System.out.println("profit: "+profit);
                buy = -1;
                sell = -1;
            }
            if(i+1 == prices.length-1){
                if(sell == -1 && buy != -1){
                    sell = prices[i+1];
                    profit += sell-buy;
                    buy = 0;
                    sell = 0;
                }
            }
        }
        return profit;
    }
}


// class Solution {
//     public int maxProfit(int[] prices) {
//         int buy=1,profit=0,elem=0,i=0;
//         while(i<prices.length){
//             //if buy flag is 1 and price of next element is heigher then buy the stock;
//             if(i+1<prices.length && buy==1 && prices[i]<prices[i+1]){
//                 elem=prices[i];
//                 buy=0;
//                 i++;
//             }else if(buy==0){
//                 //when selling the stock, don't increase the count as we can buy the stock same day 
//                 //again.
//                 profit+=prices[i]-elem;
//                 buy=1;
//             }else{
//                 i++;
//             }
//         }
//         return profit;
//     }
// }
