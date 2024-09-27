package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            System.out.print("->");
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }
        if (l1 == null || l2 == null) {
            if (l1 == null)
                return l2;
            if (l2 == null)
                return l1;
        }
        ListNode head = null;
        ListNode temp = null;
        int sum = 0, carry = 0, val = 0;
        while ((l1 != null) && (l2 != null)) {
            sum = l1.val + l2.val;
            val = sum > 9 ? sum % 10 : sum;
            if (temp == null) {
                temp = new ListNode(val + carry);
                head = temp;
            } else {
                ListNode temp2 = new ListNode(val + carry);
                temp.next = temp2;
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
            carry = sum > 9 ? sum / 10 : 0;
        }
        if (l1 == null && l2 == null) {
            if (carry > 0) {
                //   temp.val = carry * 10  + temp.val;
                ListNode extra = new ListNode(carry);
                temp.next = extra;
            }
            return head;
        } else if (l1 == null) {
            ListNode just = l2;
            while (carry > 0 && l2 != null) {
                l2.val = l2.val + carry;
                carry = l2.val > 9 ? l2.val / 10 : 0;
                l2 = l2.next;
            }
            temp.next = just;
        } else if (l2 == null) {
            ListNode just = l1;
            while (carry > 0 && l1 != null) {
                l1.val = l1.val + carry;
                carry = l1.val > 9 ? l1.val / 10 : 0;
                l1 = l1.next;
            }
            temp.next = just;
        }
        return head;
    }
}
