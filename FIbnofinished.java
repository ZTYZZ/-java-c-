
public class FIbnofinished {
	/*
	 * FIB()的递归实现
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(fib2(20));
		System.out.println(fib2(43));
		System.out.println(fib2(50));
		System.out.println(fib3(20));
		System.out.println(fib3(43));
		System.out.println(fib3(50));
		System.out.println(fib1(20));
		System.out.println(fib1(43));
		System.out.println(fib1(50));
	}
/*
 * 第一种方法：递归，其复杂度为O(1.6^n)接近O(2^n)
 * 之所以会这么慢，根据递归跟踪就很容易得出结论
 * 有大量的重复。
 */
	public static int fib1(int n) {
		return (n > 2) ? fib1(n - 1) + fib1(n - 2) : n;
	}
	
	/*
	 * 第二种方法：迭代
	 * A:记忆：memoization
	 * B:动态规划 颠倒计算方向
	 * 
	 * in B case:we can imagine as a walk upstairs,
	 * use f is a floor.
	 * use g is a upper floor.
	 * we go upstairs is one by one.
	 * g = g+f;
	 * f = g-f;
	 * 
	 * 
	 */
	
	public static int fib2(int n) {
		int f =0;
		int g =1;//init
		while(n>0) {
			g = g+f;
			f = g-f;
			n--;
			  
		}
		
		return g;
	}
	/*
	 * 3:linear-recursion
	 * through inclusion,we found that we needn't 
	 * to compute twp recursion fib(n-1) and fib(n-2)
	 * 
	 *  we just copute fib(n-1)and fib(n) is ok
	 *  
	 *  no finished.
	 */
	
	public static int fib3(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return 1;//fib3(n-1) + fib3(n);
		}
	}
	
	
	
}
