class Solution {
    public int maxProfit(int[] prices) {
        int move = 0;
        int first =0;

        if(prices.length>1){
            move = 1;
        }else{
            return 0;

        }
        int diff= 0;
        int maxdiff=0;
        while(move<=prices.length-1){
            if(prices[move]>prices[first]){
            diff= prices[move]-prices[first];
            if(diff>maxdiff){
                maxdiff= diff;
            }
            move++;
            }else if(prices[move]<=prices[first]){
                first = move;
                move++;
            }
        }
return maxdiff;
    }
}