package AlgoExpertProblems.Arrays;

import java.util.Arrays;

public class NonConstructChange {

    public int nonConstructionChange(int[] coins) {
        Arrays.sort(coins);
        int currentSum = 0;
        for (int coin: coins){
            if (coin> (currentSum+1)){
                return (currentSum+1);
            }
            currentSum += coin;
        }
        return currentSum+1;
    }

    public static void main(String[] args) {
        int[] coins = {5,7,1,1,2,3,22};
        NonConstructChange nonConstructChange = new NonConstructChange();
        System.out.println(nonConstructChange.nonConstructionChange(coins));
    }
}
