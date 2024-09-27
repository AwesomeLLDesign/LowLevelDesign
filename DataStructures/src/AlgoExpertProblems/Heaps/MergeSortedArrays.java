package AlgoExpertProblems.Heaps;

import java.util.*;

class ListIndexElement {

    Integer item;
    Integer index;
    Integer listNumber;


    ListIndexElement(int n, int i, int l) {
        this.item = n;
        this.listNumber = l;
        this.index = i;
    }
}

public class MergeSortedArrays {

    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(-95);
        arr1.add(-74);
        arr1.add(1);
        arrays.add(arr1);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(-28);
        arr2.add(28);
        arr2.add(95);
        arrays.add(arr2);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(-89);
        arr3.add(-78);
        arr3.add(-67);
        arr3.add(-66);
        arr3.add(-25);
        arr3.add(-22);
        arr3.add(2);
        arr3.add(38);
        arrays.add(arr3);
        List<Integer> arr4 = new ArrayList<>();
        arr4.add(-86);
        arr4.add(-35);
        arr4.add(-25);
        arr4.add(-13);
        arr4.add(41);
        arrays.add(arr4);
        List<Integer> arr5 = new ArrayList<>();
        arr5.add(-85);
        arr5.add(-77);
        arr5.add(-21);
        arr5.add(72);
        arrays.add(arr5);
        List<Integer> arr6 = new ArrayList<>();
        arr6.add(-55);
        arr6.add(4);
        arr6.add(84);
        arr6.add(98);
        arrays.add(arr6);
        List<Integer> arr7 = new ArrayList<>();
        arr7.add(-75);
        arr7.add(-73);
        arr7.add(22);
        arrays.add(arr7);

        List<Integer> result = mergeSortedArrays(arrays);
        for (Integer no : result) {
            System.out.println(no);
        }
    }

    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {

        List<Integer> result = new ArrayList<>();

        Comparator<ListIndexElement> comp = new Comparator<ListIndexElement>() {
            @Override
            public int compare(ListIndexElement o1, ListIndexElement o2) {
                if ((int) o1.item >= (int) o2.item) {
                    return 1;
                } else
                    return -1;
            }
        };

        PriorityQueue<ListIndexElement> pq = new PriorityQueue<>(comp);
        for(int i = 0; i < arrays.size(); i++){
            ListIndexElement l0 = new ListIndexElement(arrays.get(i).get(0), 0, i);
            pq.add(l0);
        }

        while (!pq.isEmpty()) {
            ListIndexElement temp = pq.poll();
            result.add(temp.item);
            int listNumber = temp.listNumber;
            int index = temp.index + 1;
            if (index < arrays.get(listNumber).size()) {
                pq.add(new ListIndexElement(arrays.get(listNumber).get(index), index, listNumber));
            }
        }
        // Write your code here.
        return result;
    }
}
