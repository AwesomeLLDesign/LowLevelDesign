package FacebookPractice;

public class Battleship {

    public static void main(String[] args) {
        int[][] G = {{0, 0, 1}, {1, 0, 1}};
        System.out.println(getHitProbability(2, 3, G));
    }

    public static double getHitProbability(int R, int C, int[][] G) {
        int countOfOne = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (G[i][j] == 1)
                    countOfOne++;
            }
        }
        int total = (R * C);
        int countOfZero = total - countOfOne;
        double probability = ((double) countOfOne / (double) total)/1000000;
        return probability;
    }
}
