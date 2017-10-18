

public class PrintListNode {
	public static void main(String[] args) {
		
	}
}
/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

    //解法1：
    //从头到尾打印节点
    //再从尾到头导一遍
    //需要注意的是，arrayList.toArray 返回的是Object[]数组
    
 /*        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(listNode!=null) {
			arrayList.add(listNode.val);
        	listNode = listNode.next;
        }
        Object[] array = arrayList.toArray();
        arrayList.clear();
        
        for(int i = array.length-1;i>=0;i--) {
			arrayList.add((Integer)array[i]);
        }
        return arrayList;
*/
       //解法2：递归算法
        //限制内存所以GG,看来题目的意思是不让用递归解了
       
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
       while(listNode!=null) {
			printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
       }
        return arrayList; 
    }
}