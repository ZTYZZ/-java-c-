package offercode;

import java.util.Scanner;

/*
 * ��Ŀ����
 * ��ʵ��һ������
 * ��һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class ReplaceSpace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		s = replaceSpace(sb);
		System.out.println(s);
	}
	//ʹ��������ʽ
	// ��java�� \\ ��ʾ����������ʽ��\
	//���Ҫ������ͨ��\ ��Ҫд�� \\\\
	//\s \d \S \D \w \W \t \n \r \f \e
	public static String replaceSpace(StringBuffer str) {
		String s = str.toString();
		s = s.replaceAll("\\s", "%20");
//		return s;
//		return str.toString().replace(" ", "%20");������
//		return str.toString().replaceAll("\\s" , "%20");
		return str.toString().replace(" ","%20");
	}
}
