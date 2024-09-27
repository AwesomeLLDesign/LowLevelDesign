package LowLevelDesign.ListItertor;

import java.util.*;

public class ListSolution {

    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l2.add("a");
        l2.add("b");
        l2.add("c");
        List<String> l3 = new ArrayList<>();
        List<String> l4 = new ArrayList<>();
        l4.add("d");
        l4.add("e");
        l4.add("f");
        ls.add(l1);
        ls.add(l2);
        ls.add(l3);
        ls.add(l4);
        ListCollections lc = new ListCollections(ls);
        Iterator itr = lc.getItertor();
        while (itr.hasNext()){
            System.out.println("Elements: " + itr.next());
        }
    }
}
