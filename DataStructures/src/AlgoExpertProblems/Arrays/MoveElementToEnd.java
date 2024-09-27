package AlgoExpertProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    private static List<Integer> moveElementToEnd(List<Integer> array, int toMove){

        if (array == null || array.size() == 0){
            return array;
        }
        int length = array.size();
        int start = 0, end = length-1;
        while(start<end){

            if(array.get(end) == toMove){
                end--;
            }else if (array.get(start) == toMove){
                int end_element = array.get(end);
                int start_element = array.get(start);
                array.remove(end);
                array.add(end,start_element);
                array.remove(start);
                array.add(start,end_element);
                start++;
            }else {
                start++;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int toMove = 2;
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);array.add(2);array.add(2);array.add(2);array.add(3);
        array.add(4);array.add(2);
        List<Integer> result = moveElementToEnd(array,toMove);
        for(Integer element: result){
            System.out.println(element);
        }
    }
}
