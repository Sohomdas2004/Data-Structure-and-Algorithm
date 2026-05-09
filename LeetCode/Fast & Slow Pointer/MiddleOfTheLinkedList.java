class ListNode {
      int val;
      ListNode next;
      
 }

public class MiddleOfTheLinkedList{
    public ListNode middleNode(ListNode head) {
        ListNode first,second;
        first=head;
        second=head;

        while(first!=null && first.next != null){
            second=second.next;
            first=first.next.next;
        }

        return second;
    }
}