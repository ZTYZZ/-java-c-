package offercode;
/*
 * ��Ŀ����
 * ��һ����ά�����У�
 * ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 * 
 * ����:
 * ����forѭ����Ȼ��O(n^2)������Ҫ�ҵ�һ��Ԫ�أ��������һ�����鰡
 * ���Ա�����������ȡ�𣿲���ȡ����Ϊ�����������
 */
public class FindArray {

//	public static void main(String[] args) {
//		int[][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//		boolean flag = Find(7,array);
//		System.out.print(flag);
//	}
//	 public static boolean Find (int target,int[][] array) {
//		 boolean flag = false;
//		 int i = array.length-1;
//		 int j = 0;
//		 
//		 while(i>=0&&j<array[i].length) {
//			 if(array[i][j] == target) {
//				 flag = true;
//				 break;
//			 }
//			 else if(array[i][j] < target) {
//				 j++;
//			 }
//			 else {
//				 i--;
//			 }
//		 }
//		 return flag;
//	 }


}
/*
 * һ����������
 */
//class Solution {
//	public boolean Find(int target,int[][] array) {
//		boolean flag = false;
//		for(int i = 0;i<array.length;i++) {
//			for(int j = 0;j<array[i].length;j++) {
//				if(array[i][j] == target) {
//					flag = true;
//					break;
//				}
//				
//			}
//		}
//		return flag;
//	}
//}

/*
 * 
 * ���������½�����
 *ע��:�������
 */
 
 
 class Solution {
	 public boolean Find (int target,int[][] array) {
		 boolean flag = false;
		 int i = array.length-1;
		 int j = 0;
		 
		 while(i>=0&&j<array[i].length) {
			 if(array[i][j] == target) {
				 flag = true;
				 break;
			 }
			 else if(array[i][j] < target) {//ע�������array[i][j]<target,֮ǰд����
				 j++;
			 }
			 else {
				 i--;
			 }
		 }
		 return flag;
	 }
}
