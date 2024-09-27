package DP.LoveBabbar;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int N = 3;
        int sum = 4;
        long count = count(coins,N,sum);
    }

    private static long count(int coins[], int N, int sum) {
        if(sum <= 0 || coins.length == 0){
            return 0;
        }
        long currSum = 0;
        long countWays = 0;
        countUtil(currSum,coins,sum, countWays);
        return 0;
    }

    private static long countUtil(long currSum, int[] coins, int sum, long countWays){

        if (currSum == sum){
            return ++countWays;
        }
        for(int i =0; i < coins.length; i++){
            currSum += coins[i];
            countUtil(currSum,coins,sum,countWays);
        }
        return 0;
    }

}
