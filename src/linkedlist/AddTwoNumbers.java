package linkedlist;

/**
 * Definition for singly-linked list.
 */
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


public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers(l1, l2);

        /*
        while(l1 != null){
            System.out.print(l1.val);
            l1 = l1.next;
        }
         */
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode();
        ListNode head = output;
        boolean pass = false;


        while (l1 != null || l2 != null) {
            int val1 = 0;
            int val2 = 0;
            int sum = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            sum = (val1 + val2) % 10;
            if (pass) {
                sum = sum + 1;
            }
            if (val1 + val2 > 9 | sum > 9) {
                pass = true;
            } else {
                pass = false;
            }
            output.next = new ListNode(sum % 10);
            output = output.next;
        }
        if (pass)
            output.next = new ListNode(1);
        output = head.next;
        while(output != null){
            System.out.print(output.val);
            output = output.next;
        }
        return output;
    }
}
