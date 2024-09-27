package Interviews.EPAM;

import java.util.ArrayList;
import java.util.List;

class Pair{

    int data;
    int timeStamp;

    public Pair(int key, int time){
        this.data = key;
        this.timeStamp = time;
    }

}

public class RateLimiting {

    public static void main(String[] args) {

//        List<Pair> request = new ArrayList<>();
//        request.add(new Pair(10, 2));
//        request.add(new Pair(10, 10));
//        request.add(new Pair(10, 20));
//        request.add(new Pair(10, 50));
//        request.add(new Pair(10, 70));
//        request.add(new Pair(10, 99));
//        request.add(new Pair(10, 112));
//        rateLimitingCap(request);
//
//    }
//
//    private static void rateLimitingCap(List<Pair> request) {
//
//        if (request == null || request.size() == 0) {
//            System.out.println("No Request Made so far");
//            return;
//        }
//
//        int startTime = -1;
//        int currTime = -1;
//        int diff = -1;
//        int counter = 0;
//
//        for (Pair pair : request) {
//            counter++;
//            if (startTime == -1) {
//                startTime = pair.timeStamp;
//            } else {
//                currTime = pair.timeStamp;
//            }
//            if (currTime != -1) {
//                diff = currTime - startTime;
//            } else {
//                return;
//            }
//
//            System.out.println(checkRateLimit(pair.data, startTime, currTime, counter, diff));
//        }
//
//
//    }
//
//    private static boolean checkRateLimit(int data, int startTime, int currTime, int counter, int diff) {
////        if (currTime != -1) {
////            diff = currTime - startTime;
////        }
////        if (diff <= 100) {
////            if (counter < 5) {
////                return true;
////            } else {
////                return false;
////            }
////            return false;
////        }
//    }
    }
}
