/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //两个临时节点。一个进位表示符,当前空节点
        ListNode t1,t2,cur,head;
        int carry = 0;
        cur = new ListNode(0);
        head = cur;
        t1 = l1;
        t2 = l2;
        
        while(t1!=null||t2!=null) {//注意这里！！！！
            //当两个链表都不为空的时候，进入
            int x = (t1!=null)?t1.val:0;
            int y = (t2!=null)?t2.val:0;
            int sum = x+y + carry;
            carry = sum/10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (t1!= null) t1 = t1.next;
            if (t2!= null) t2 = t2.next;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return head.next;
    }
}
            
        
    

