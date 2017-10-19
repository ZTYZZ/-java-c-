

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    //use a tempted string 
    //condiser as much as cases.
    public int lengthOfLongestSubstring(String s) {
        String substring = "";
        int maxLength =1;
        if(s.equals("")) return 0;
        else {
            for(int i=0;i<s.length();i++) {
                if(substring.contains(s.substring(i,i+1))) {

                    substring=substring.substring(1);
                    i--;
                }
                else {
                    substring += s.charAt(i);
                    if(substring.length()>maxLength)
                        maxLength=substring.length();
                }
                
            
            }
           
         return maxLength;
        }
    }
 
}
