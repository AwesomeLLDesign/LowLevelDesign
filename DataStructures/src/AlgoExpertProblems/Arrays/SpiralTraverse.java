package AlgoExpertProblems.Arrays;

import java.util.*;

public class SpiralTraverse {

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int[][] array2 = {{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}};
        List<Integer> result = spiralTraverse(array2);
        result.stream().forEach(num -> System.out.println(num));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int rows = array.length;
        int cols = array[0].length;
        int row_idx = 0;
        int col_idx = 0;
        int start = 0;
        int loop_idx = 0;
        int loopLimit = 0;
        if(rows%2==0) loopLimit = rows/2;
        else loopLimit = rows/2 + 1;
        boolean check = false;

        while(loop_idx < loopLimit){
            while(col_idx < cols){
                result.add(array[row_idx][col_idx]);
                col_idx++;
                check = true;
            }
            if (check) {
                col_idx--;
                row_idx++;
                check = false;
            }else{
                break;
            }
            while(row_idx < rows){
                result.add(array[row_idx][col_idx]);
                row_idx++;
                check = true;
            }
            if (check) {
                row_idx--;
                col_idx--;
                check = false;
            }else{
                break;
            }
            while(col_idx >= start){
                if (row_idx == rows)break;
                result.add(array[row_idx][col_idx]);
                col_idx--;
                check = true;
            }
            if (check) {
                col_idx++;
                row_idx--;
                check = false;
            }else{
                break;
            }
            while(row_idx > start){
                result.add(array[row_idx][col_idx]);
                row_idx--;
                check = true;
            }
            if (check) {
                start++;
                row_idx = start;
                col_idx = start;
                rows--;
                cols--;
                check = false;
            }else{
                break;
            }
            loop_idx++;
        }

        return result;
    }

}
