
public class FIb {
	/*
	 * FIB()�ĵݹ�ʵ��
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(fib(20));
		System.out.println(fib(43));
		System.out.println(fib(50));
	}

	public static int fib(int n) {
		return (n > 2) ? fib(n - 1) + fib(n - 2) : n;
	}
}
