package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Stu {

    int rollNo;
    String name;
    int age;

    Stu(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

}

// Priority Queue doesn't allow duplicates as well
public class BasicOperation {

    public static void main(String[] args) {

        Stu stu1 = new Stu(188, "ZERF", 12);
        Stu stu2 = new Stu(20, "BW", 18);
        Stu stu3 = new Stu(63, "AXU", 16);

        Comparator<Stu> rollNoComparator = new Comparator<Stu>() {
            // descending order
            @Override
            public int compare(Stu o1, Stu o2) {
                if (o1.rollNo > o2.rollNo) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<Stu> nameComparator = new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                if (o1.name.compareTo(o2.name) > 0) {
                    return 1;
                } else
                    return -1;
            }
        };

        PriorityQueue<Stu> pq = new PriorityQueue<Stu>(nameComparator);
        pq.add(stu1);
        pq.add(stu2);
        pq.add(stu3);

        System.out.println("Top Element present in priority queue " + pq.peek().name);
        System.out.println("Removal of top Element present in priority queue " + pq.remove().name);
        System.out.println("Top Element present in priority queue " + pq.peek().name);

    }
}
