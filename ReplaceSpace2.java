package offercode;
/*
 * matches 方法
 * 正则表达式
 */
public class ReplaceSpace2 {
	public static void main(String[] args) {
		for(String pattern :new String[] {
				"Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*", "R.*"
		}) 
			System.out.println("Rudolph".matches(pattern));//均为true
	}
}
