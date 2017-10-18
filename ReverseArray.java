import java.util.Arrays;
/*
 * reverse Array
 * two methods:
 */
public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {1 ,5,4,5,6,8,9};
		reverse(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
		reverse2(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	/*
	 * 1.recursion 
	 * tail-recursion
	 * complexity is O(n)
	 */
	public static void reverse(int[] array,int low,int high) {
		if(low<high) {
			int temp = array[low] ;
			array[low] = array[high];
			array[high] = temp;
			reverse(array,low+1,high-1);
		}
		//"else "actually contains two base cases of recursion
		
	}
	
	/*
	 * 2.interation 
	 * note:any tail-recursion algrarithm can turn to be iteratin
	 * 
	 */
	
	public static void reverse2(int[] array,int low,int high) {
		while(low<high) {
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			
			low++;
			high--;
		}
	}
}
