import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Optional;

public class JavaBasics {
    public static void main(String[] args) {

        String arr[] = {};
        Optional result = Arrays.stream(arr).reduce((item1, item2) -> item1 + ", " + item2);
        if (result.isPresent()){
            System.out.println(result.get());
        }else
            System.out.println(" ");

    }
}
