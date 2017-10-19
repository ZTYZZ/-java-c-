
public class FIbnofinished {
	/*
	 * FIB()�ĵݹ�ʵ��
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
 * ��һ�ַ������ݹ飬�临�Ӷ�ΪO(1.6^n)�ӽ�O(2^n)
 * ֮���Ի���ô�������ݵݹ���پͺ����׵ó�����
 * �д������ظ���
 */
	public static int fib1(int n) {
		return (n > 2) ? fib1(n - 1) + fib1(n - 2) : n;
	}
	
	/*
	 * �ڶ��ַ���������
	 * A:���䣺memoization
	 * B:��̬�滮 �ߵ����㷽��
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
