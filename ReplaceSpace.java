package offercode;

import java.util.Scanner;

/*
 * 题目描述
 * 请实现一个函数
 * 将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
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
	//使用正则表达式
	// 在java中 \\ 表示的是正则表达式的\
	//如果要插入普通的\ 则要写成 \\\\
	//\s \d \S \D \w \W \t \n \r \f \e
	public static String replaceSpace(StringBuffer str) {
		String s = str.toString();
		s = s.replaceAll("\\s", "%20");
//		return s;
//		return str.toString().replace(" ", "%20");还可以
//		return str.toString().replaceAll("\\s" , "%20");
		return str.toString().replace(" ","%20");
	}
}
