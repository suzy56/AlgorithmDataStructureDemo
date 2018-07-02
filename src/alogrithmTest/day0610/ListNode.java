package alogrithmTest.day0610;

public class ListNode {
    int val;
    ListNode next;
    ListNode (int x){
        val = x;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(val);
        //next.next != null
        ListNode arrow = this.next;
        while (arrow != null){
            sb.append("->" + arrow.val);
            arrow = arrow.next;
        }

        return sb.toString();
    }
}
