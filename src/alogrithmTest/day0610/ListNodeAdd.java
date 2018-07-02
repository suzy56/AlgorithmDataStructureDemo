package alogrithmTest.day0610;

public class ListNodeAdd {

    public ListNode listNode1;
    public ListNode listNode2;

    {
        listNode1 = new ListNode(8);
        listNode2 = new ListNode(3);

        listNode1.next = new ListNode(7);
        listNode1.next.next = new ListNode(1);
        listNode2.next = new ListNode(2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("=");
        //初始化结果为 0 -> null
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        //偏移量 listNode 取值范围 0-9 所有 0-9 + 0-9  p+q范围为0-18 carry 非0即1
        int carry = 0;
        //当p,q不为空时
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            // 计算p,q对应位数字之和
            int sum = carry + x + y;
            //偏移量 移位  例如 9+8 +0 = 17    carry = 1 再下次循环中进一位
            carry = sum / 10;
            // 取数字之和的余数 如 17 中的7
            curr.next = new ListNode(sum % 10);
            // 指针后移
            curr = curr.next;
            //p,q  向后移位
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        // 最后一个数字刚好进位时  如1-4-9 + 2-7   =>  3->1->0 此时carry为1，next.val为0，需要补个节点  ->1
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNodeAdd la = new ListNodeAdd();
        ListNode result = la.addTwoNumbers(la.listNode1,la.listNode2);
        System.out.println(result);
    }
}


