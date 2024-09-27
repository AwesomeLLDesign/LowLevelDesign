package Recursion;

public class LastOccuranceOfChar {

    public static void main(String[] args) {
        System.out.println(findLastOccurance("geeks",'e'));

        System.out.println(findLastOccurance("hello world!",'o'));
    }

    private static int findLastOccurance(String str, char x){

        if(str.isEmpty()){
            return -1;
        }
        int output = findLastOccuranceOfChar(str,0, Integer.MIN_VALUE,x);
        if( output == Integer.MIN_VALUE){
            return -1;
        }
        return output;

    }

    private static int findLastOccuranceOfChar(String str, int index, int answer, char x){
        // base case

        if(index == str.length()){
            return answer;
        }

        if(x == str.charAt(index)){
            answer = index;
        }
        // processing
        return findLastOccuranceOfChar(str,index+1,answer,x);
        //recursion

    }


}
