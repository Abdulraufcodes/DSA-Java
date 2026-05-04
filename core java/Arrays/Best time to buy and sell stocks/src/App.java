public class App {
    public static int buyandsellstocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            //condition for profit
            if(buyprice < prices[i]){ //prices[i] is the price of today
                int profit = prices[i] - buyprice ;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i]; //becuz if today price is lowest than previous days then buy stock
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) throws Exception {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));
    }
}
