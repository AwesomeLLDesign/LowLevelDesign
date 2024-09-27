package AlgoExpertProblems.Recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("The fibannaci no is " + getNthFib(4));
    }

    public static int getNthFib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2 || n == 3)
            return 1;
        return getNthFibNumber(1, 1, n, 4);
        // Write your code here.
    }

    public static int getNthFibNumber(int first, int second, int N, int currN) {
        int sum = first + second;
        first = second;
        second = sum;
        if (currN == N) {
            return second;
        }
        return getNthFibNumber(first, second, N, currN + 1);
    }
}
