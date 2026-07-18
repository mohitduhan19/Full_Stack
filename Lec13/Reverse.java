package Lec13;

public class Reverse {
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;

        ListNode prev = null , curr = head;
        while(curr != null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
