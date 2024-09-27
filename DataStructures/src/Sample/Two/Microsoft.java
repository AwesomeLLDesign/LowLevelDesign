package Sample.Two;

import java.util.*;

public class Microsoft {

    public static void main(String[] args) {
        Microsoft ms = new Microsoft();
        String[] arr = {"x","1","d","2","1","a","1","d","c","1","r","1","2","y","3","i"};
        System.out.println(ms.solution(arr,4,"carry"));
    }

    char[][] GetMatrixForm(String[] A, int Y)
    {
        char[][] matrix = new char[Y][];
        for (int i = 0; i < Y; i++)
        {
            matrix[i] = new char[Y];
        }

        for (int i = 0; i < A.length; i++)
        {
            matrix[i / Y][i % Y] = A[i].charAt(0);
        }
        return matrix;
    }

    private boolean solution(String[] A, int Y, String U) {
        char[][] matrix = GetMatrixForm(A, Y);
        String result = convertString(U);
        System.out.println("String result------" + result);
        return findMatrix(Y,Y,matrix,result);
    }

    private boolean findTheWord(char[][] matrix,int startindex, String U, int row, int column) {
        if(startindex >= U.length()){
            return true;
        }
        char current = U.charAt(startindex);
            if(validMove(row + 1,column,0,0,3,3) && (current == matrix[row+1][column])){
                return findTheWord(matrix,startindex + 1, U,row + 1,column);
            }
            if(validMove(row,column + 1,0,0,3,3) && (current == matrix[row][column + 1])){
                return findTheWord(matrix,startindex + 1, U,row,column + 1);
            }
            if(validMove(row - 1,column,0,0,3,3) && (current == matrix[row-1][column])){
                return findTheWord(matrix,startindex + 1, U,row - 1,column);
            }
            if(validMove(row ,column - 1,0,0,3,3) && (current == matrix[row][column - 1])){
                return findTheWord(matrix,startindex + 1, U,row,column - 1);
            }
        return false;
    }

    private boolean validMove(int row, int column, int lower_Row, int lower_Column,int higher_Row, int higher_Column){
        if(row >= 0 && row < 3 && column >= 0 && column < 3)
            return true;
        return false;
    }

    private String convertString(String s)
    {
        String answer = null;
        for (int i = 0; i < s.length(); i++) {

            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if(answer == null){
                answer = new String(s.charAt(i) + "" + count);
            }else{
                answer += s.charAt(i)
                        + "" + count;
            }
        }
        return answer;

    }

    public char[][] generateMatrix(int row, int col, char input[][]){
        char test [][] = new char[3][3];
        int p=0,q=0;
        for(int i=row;i<row+3;i++){
            q=0;
            for(int j=col;j<col+3;j++){
                test[p][q] = input[i][j];
                q++;
            }
            p++;
        }
        return test;
    }

    public boolean findMatrix(int row, int column, char in[][], String U){

        int i = 0;
        int j = 0;
        int jglobal=0;
        boolean result= false;


        while(i+2 < row){
            while(j+2 < column){
                char matrix[][] = generateMatrix(i,j,in);
                char start = U.charAt(0);

                for (int p = 0; p < 3; p++) {
                    for (int q = 0; q < 3; q++) {
                        if (matrix[p][q] == start) {
                            result = findTheWord(matrix, 1,U,p,q);
                            if (result)return result;
                        }
                    }
                }
                j++;
            }
            i++;
            j = 0;
        }
        return result;
    }




/**
 * array to matrix
 * all 3*3 matrix
 * find the word
 *
 *
 * */


//    private int ALPHABETS_SIZE = 26;
//    private int CAPITAL_ASCII_START = 65;
//    private int CAPITAL_ASCII_END = 90;
//
//    public int solution(String S) {
//        int[] small = new int[ALPHABETS_SIZE];
//        int[] caps = new int[ALPHABETS_SIZE];
//
//        Arrays.fill(small, 0);
//        Arrays.fill(caps, 0);
//        for (int start_index = 0; start_index < S.length(); start_index++) {
//            if (S.charAt(start_index) >= CAPITAL_ASCII_START && S.charAt(start_index) <= CAPITAL_ASCII_END)
//                caps[S.charAt(start_index) - 'A']++;
//            else
//                small[S.charAt(start_index) - 'a']++;
//        }
//        Map<Character, Integer> mp = new HashMap<>();
//
//        for (int i = 0; i < ALPHABETS_SIZE; i++) {
//            if (small[i] != 0 && caps[i] == 0)
//                mp.put((char) (i + 'a'), 1);
//            else if (caps[i] != 0 && small[i] == 0)
//                mp.put((char) (i + 'A'), 1);
//        }
//
//        Arrays.fill(small, 0);
//        Arrays.fill(caps, 0);
//
//        int i = 0, st = 0;
//
//        int start = -1, end = -1;
//
//        int minm = Integer.MAX_VALUE;
//
//        while (i < S.length()) {
//            if (mp.get(S.charAt(i)) != null) {
//
//                while (st < i) {
//                    if (S.charAt(st) >= CAPITAL_ASCII_START &&
//                            S.charAt(st) <= CAPITAL_ASCII_END)
//                        caps[S.charAt(st) - 'A']--;
//                    else
//                        small[S.charAt(st) - 'a']--;
//
//                    st++;
//                }
//                i += 1;
//                st = i;
//            } else {
//                if (S.charAt(i) >= CAPITAL_ASCII_START && S.charAt(i) <= CAPITAL_ASCII_END)
//                    caps[S.charAt(i) - 'A']++;
//                else
//                    small[S.charAt(i) - 'a']++;
//
//                while (true) {
//                    if (S.charAt(st) >= CAPITAL_ASCII_START &&
//                            S.charAt(st) <= CAPITAL_ASCII_END &&
//                            caps[S.charAt(st) - 'A'] > 1) {
//                        caps[S.charAt(st) - 'A']--;
//                        st++;
//                    } else if (S.charAt(st) >= 97 &&
//                            S.charAt(st) <= 122 &&
//                            small[S.charAt(st) - 'a'] > 1) {
//                        small[S.charAt(st) - 'a']--;
//                        st++;
//                    } else
//                        break;
//                }
//
//                if (balancedSubString(small, caps)) {
//                    if (minm > (i - st + 1)) {
//                        minm = i - st + 1;
//                        start = st;
//                        end = i;
//                    }
//                }
//                i += 1;
//            }
//        }
//
//        if (start == -1 || end == -1)
//            return -1;
//
//        else {
//            String ans = "";
//            for (int j = start; j <= end; j++)
//                ans += S.charAt(j);
//
//            return ans.length();
//        }
//    }
//
//    boolean balancedSubString(int small[], int caps[]) {
//
//        for (int i = 0; i < ALPHABETS_SIZE; i++) {
//            if (small[i] != 0 && (caps[i] == 0))
//                return false;
//
//            else if ((small[i] == 0) && (caps[i] != 0))
//                return false;
//        }
//        return true;
//    }

}
