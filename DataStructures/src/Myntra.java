import java.util.*;

public class Myntra {

    public static void main(String[] args) {
//        HashMap h = new HashMap();
//        h.put(null, 1);
        Set s = new TreeSet();
        s.add("Aron");
        s.add(1);
//        Set s = h.keySet();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
