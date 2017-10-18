import java.util.Arrays;
//pass an array as arguments to a method actually is pass an address.

public class Swap {

	public static void main(String[] args) {
		  int[] array = {1,2,3};
		  swap(array,0,2);
		  System.out.println(Arrays.toString(array));//result is [3,2,1] ,it has been changed.
	}
	public static void swap(int[] array,int m,int n) {//pass an adress 
		  int temp = array[m];
		  array[m] = array[n];
		  array[n] = temp;
		}
}
