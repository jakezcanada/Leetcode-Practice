public class P876 {
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
