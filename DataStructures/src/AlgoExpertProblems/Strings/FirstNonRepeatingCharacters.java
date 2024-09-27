package AlgoExpertProblems.Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacters {

    private static final int numberOfChars = 256;

    private static int findFirstNonRepeatChar(String input){
        if(input == null || input.length() == 0)
            return -1;

        int[] frequencyCount = new int[numberOfChars];
        Arrays.fill(frequencyCount,-1);
        char[] inputCharacters = input.toCharArray();
        // This is to count the frequency of characters
        for(int i = 0 ; i < inputCharacters.length; i++){
            int currIndex = inputCharacters[i] - '0';
            if(frequencyCount[currIndex] == -1){
                frequencyCount[currIndex] = 1;
            }else{
                ++frequencyCount[currIndex];
            }
        }

        // This is to find the first characte inthe array

        for(int i = 0; i< inputCharacters.length; i++){
            int currIndex = inputCharacters[i] - '0';
            if(frequencyCount[currIndex] == 1){
                return i;
            }
        }

    return  -1;
    }

    public static void main(String[] args) {

        String[] inputArray = {"abcdcaf", "apple", "banana"};
        Integer[] outputArray = {1, 0, 0};
        for(int i = 0; i < inputArray.length; i++){
            if (outputArray[i] == findFirstNonRepeatChar(inputArray[i])){
                System.out.println("Test passed");
            }else{
                System.out.println("Test failed");
            }
        }
        //System.out.println("The output for this program is :  " + findFirstNonRepeatChar("abcdcaf"));
    }
}
