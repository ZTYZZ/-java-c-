

public class PrintListNode {
	public static void main(String[] args) {
		
	}
}
/**
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
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

    //�ⷨ1��
    //��ͷ��β��ӡ�ڵ�
    //�ٴ�β��ͷ��һ��
    //��Ҫע����ǣ�arrayList.toArray ���ص���Object[]����
    
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
       //�ⷨ2���ݹ��㷨
        //�����ڴ�����GG,������Ŀ����˼�ǲ����õݹ����
       
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
       while(listNode!=null) {
			printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
       }
        return arrayList; 
    }
}