
public class FIb {
	/*
	 * FIB()�ĵݹ�ʵ��
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(fib2(20));
		System.out.println(fib2(43));
		System.out.println(fib2(50));
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
	 */
	
	public static int fib2(int n) {
		int f =0;
		int g =1;//init
		while(0<n--) {
			g = g+f;
			f = g-f;
			
		}
		
		return g;
	}
	
	
}
