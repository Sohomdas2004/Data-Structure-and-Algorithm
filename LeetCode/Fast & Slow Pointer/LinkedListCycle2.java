//LeetCode 142. Linked List Cycle II

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow,fast;
        boolean flag=true;
        slow=head;
        fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                flag=false;
                break;
            }
        }

        if(flag){
            return null;
        }

        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
}
