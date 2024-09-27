package LinkedList.classes.class3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class CheckPalindrome {

    public static void main(String[] args) {

        // declare ll with the inbuild list

//        String[] input = {"a","b", "c", "b", "a"};
//        List<String> ll = new LinkedList<>();
//        for (String str: input)ll.add(str);
//
//        for (St)

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(1);
        System.out.println("the givem ll is palindrome: " + validatePalindrome(head));
    }

    private static boolean validatePalindrome(ListNode head){
        ListNode itr = head;
        ListNode previousOfSlow = null, slow = head, fast = head;
        if(fast!= null && fast.next != null){
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                previousOfSlow = slow;
                slow = slow.next;
            }
        }

        ListNode middleNode = null;

        // check whether fast is not null,
        // then length should be odd in that case

        if(fast!=null){
            middleNode = slow;
            slow = slow.next;
            previousOfSlow.next = null;
        }


//        if(middleNode == null) return middleNode;
        ListNode curr = slow;
        ListNode prev = null;
//        middleNode.next = null;
        ListNode secondHalf = reverseLL(curr,prev);
        while (itr != null && secondHalf != null ){
            if (itr.data != secondHalf.data) return false;
            itr = itr.next; secondHalf = secondHalf.next;
        }
//        if (itr != null && secondHalf == null || secondHalf != null && itr == null)
//            return false;
        return true;
    }

    private static ListNode findMiddle(ListNode head){
        if(head == null) return head;

        ListNode slow = head, fast = head;
        while (fast!=null){
            fast = fast.next;
            if(fast!=null && fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    private static ListNode reverseLL(ListNode curr, ListNode prev){
        if (curr == null) return prev;
        ListNode forward = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forward;
        return reverseLL(curr,prev);
    }



}
