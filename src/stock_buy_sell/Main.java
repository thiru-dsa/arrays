package stock_buy_sell;

public class Main {
    public static void main(String[] args) {
//        int[] prices = {7,6,4,3,1};
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {2,4,1};
        int[] prices = {1, 2};
        System.out.println(BruteForce.maxProfit(prices));
    }
}

class BruteForce {
    public static int maxProfit(int[] prices) {
        int maximumProfit = 0, minimumPrice = Integer.MAX_VALUE;

        for(int iterator = 0; iterator < prices.length; iterator++) {
            if(prices[iterator] < minimumPrice) {
                minimumPrice = prices[iterator];
            } else if(prices[iterator] - minimumPrice > maximumProfit) {
                maximumProfit = prices[iterator] - minimumPrice;
            }
        }
        return maximumProfit;
    }

    public static void print(int[] prices) {
        for(int price : prices) {
            System.out.print(price + " ");
        }
    }
}
