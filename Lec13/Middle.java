package Lec13;

public class Middle {
    public ListNode middleNode(ListNode head) {
        ListNode f = head , s = head;
        while(f.next != null && f != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
