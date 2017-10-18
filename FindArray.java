package offercode;
/*
 * 题目描述
 * 在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * 
 * 疑问:
 * 两层for循环虽然是O(n^2)，但是要找到一个元素，必须遍历一边数组啊
 * 所以暴力搜索，可取吗？不可取，因为数组是有序的
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
 * 一、暴力搜索
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
 * 二、从左下角搜索
 *注意:在下面的
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
			 else if(array[i][j] < target) {//注意这里，是array[i][j]<target,之前写反了
				 j++;
			 }
			 else {
				 i--;
			 }
		 }
		 return flag;
	 }
}
