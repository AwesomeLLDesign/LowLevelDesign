package AlgoExpertProblems.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {

    private static int firstDuplicate(int[] array){
        if (array == null || array.length == 0)
            return -1;
         int output = -1;

         Set<Integer> checkDuplicate = new HashSet<>();

         for (int i =0; i < array.length; i++){
             if (checkDuplicate.contains(array[i]))
                 return array[i];
             else
                 checkDuplicate.add(array[i]);
         }
        return -1;
    }

    public static void main(String[] args) {
        int[] first = {2,1,3,2,4};
        int[] second = {2,1,3,4};
        System.out.println(firstDuplicate(first));
        System.out.println(firstDuplicate(second));
    }
}
