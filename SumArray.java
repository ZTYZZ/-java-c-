
public class SumArray {
	public static void main(String[] args) {
		int[] array = {1, 2,3,4,5,6,7,8,9,10};
		System.out.println(sum(array,10));
		System.out.println(sum2(array,0,9));
	}
	
	/*
	 * linear recursion method of Sum of array
	 * method:decrease and conquer
	 * 1.divide a array to be a ordinary case and a decrease case
	 * 2.need a base case of recursion
	 */
	public static int sum(int[] array ,int n) {
		if(n<1) {
			return 0;//base case of recursion
		}
		
		else {
			return sum(array,n-1) + array[n-1];//notice this!!!add two!!
		}
	}
	/*
	 * 2:divide and conquer
	 * divide an array to two parts,and recusionly deal with each other
	 */
	
	public static int sum2(int[] array,int start,int end) {
		int mid = (start + end)/2;
		if(start == end) {
			return array[start];
		}
		else {
			return sum2(array,start,mid) +sum2(array,mid+1,end);
		}
	}
}
