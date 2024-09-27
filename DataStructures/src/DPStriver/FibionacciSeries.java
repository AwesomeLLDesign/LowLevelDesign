package DPStriver;

public class FibionacciSeries {

    private static int generateSeries(int n){
        if(n == 0 || n == 1)
            return n;
        return generateSeries(n-1) + generateSeries(n-2);
    }

    public static void main(String[] args) {
        System.out.println("The output for fibinacci series " + generateSeries(5));
    }
}
