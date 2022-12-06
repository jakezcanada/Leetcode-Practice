public class P876 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode end = head;
        boolean everyOther = true;
        while(end.next != null){
            if(everyOther){
                mid = mid.next;
            }
            everyOther = !everyOther;
            end = end.next;
        }
        return mid;
    }
}
