package Strings;

import java.util.Arrays;

public class AllWrong {

    public static void main(String[] args) {
        System.out.println("The output is " + getWrongAnswers(3,"ABA"));
    }

    public static String getWrongAnswers(int N, String C) {
        // Write your code here
        char[] array = C.toCharArray();
        int i = 0;
        while(i<N){
            if(array[i] == 'A'){
                array[i] = 'B';
            }else{
                array[i] = 'A';
            }
            i++;
        }
        String str = "";
        for(char ch : array)
            str += ch;
        return str;
    }
}
