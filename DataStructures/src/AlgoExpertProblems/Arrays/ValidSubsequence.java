package AlgoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ValidSubsequence {

    private boolean isValidSubSequence(List<Integer> array, List<Integer> sequence) {
        int i = 0, j = 0;
        int count_of_sequence = sequence.size();
        boolean check_Valid_Sequence = false;
        while (i < array.size()) {
            if (array.get(i) == sequence.get(j)) {
                --count_of_sequence;
                if (count_of_sequence == 0){
                    check_Valid_Sequence = true;
                    break;
                }
                i++;
                j++;
            } else {
                    i++;
            }
        }
        return check_Valid_Sequence;
    }

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(10);
        sequence.add(-1);
        sequence.add(10);
        ValidSubsequence validSubsequence = new ValidSubsequence();
        System.out.println("The sequence is valid " + validSubsequence.isValidSubSequence(array, sequence));
    }
}
