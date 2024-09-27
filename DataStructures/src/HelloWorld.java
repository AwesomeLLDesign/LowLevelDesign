public class HelloWorld {

    private int x = 1;
    protected int y = 1;
    private static int x1 = 1;
    protected static int y1 = 1;

    class Inner{

        void go(){
            System.out.println(x + " " + y + " " + x1 + " " + y1);
        }

    }

    public static void main(String[] args){
        int x = 2;
        int y = 2;
        int x1 = 1;
        int y1 = 1;
        new HelloWorld().new Inner().go();
        System.out.println("Hello World");
        for(int q = 0 ; q<2; q++);
    }
}
