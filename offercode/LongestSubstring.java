package offercode;
/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 */

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
