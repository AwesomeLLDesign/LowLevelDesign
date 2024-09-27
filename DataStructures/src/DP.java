import java.util.ArrayList;
import java.util.List;

public class DP {

    public static List<Integer> encryptionValidity(int instructionCount, int validityPeriod, List<Integer> keys) {
        long maxDegree = -1;
        for (Integer key : keys) {
            long localDegree = 0;
            for (Integer divisor : keys) {
                if (key % divisor == 0) {
                    localDegree++;
                }
            }
            if (localDegree > maxDegree) {
                maxDegree = localDegree;
            }
        }


        Long encryptionStrength = maxDegree * 100000;
        Long x = (long) instructionCount;
        Long y = (long) validityPeriod;
        Long hackerStrength = (x * y);
        List<Integer> result = new ArrayList<>();
        if (hackerStrength > encryptionStrength) {
            result.add(1);
        } else {
            result.add(0);
        }
        Integer i = (int) (long) encryptionStrength;
        result.add(i);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> keys = new ArrayList<>();
        keys.add(2);
        keys.add(4);
        keys.add(8);
        keys.add(2);
        List<Integer> result = encryptionValidity(1000, 10000, keys);
        result.forEach(i -> System.out.println(i));

        System.out.println("---------");
        List<Integer> keys1 = new ArrayList<>();
        keys1.add(83315);
        keys1.add(22089);
        keys1.add(19068);
        keys1.add(64911);
        keys1.add(67636);
        keys1.add(4640);
        keys1.add(80192);
        keys1.add(98971);
        List<Integer> result1 = encryptionValidity(9677958, 50058356, keys1);
        result1.forEach(i -> System.out.println(i));
    }
}
