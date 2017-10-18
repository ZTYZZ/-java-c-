import java.util.Arrays;

/**
 * 
 * ÆğÅİÅÅĞò£¬Ò²½ĞÃ°ÅİÅÅĞò
 * here is something important
 *1.in first loop,notice the large of n (array.length-1)
 *2.Arrays.toString :class Arrays provide the methods
 * @author dream
 *
 */
public class Bubble_sort {
	public static void main(String[] args) {
		int[] array = {1,3,4,6,0,9,2};
		array = bubbleSort(array,array.length);
		System.out.println(Arrays.toString(array));
		
	}
	public static int[] bubbleSort(int[] array,int n) {
		boolean flag = false;
		int temp;
		for(int i = n-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = true;
				}
				
				
			}
			if(!flag) {
				break;
			}
		}
		return array;
	}
}
