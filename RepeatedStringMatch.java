/*Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (¡°abcdabcdabcd¡±), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.
 * 
 */
public class RepeatedStringMatch {
	
}

//one solution
class Solution {
    public int repeatedStringMatch(String A, String B) {
        int k = 1;
        StringBuilder C = new StringBuilder(A);
        for(;(k*A.length())<B.length();k++) {
            C = C.append(A);
            
        }
        if(C.indexOf(B)!=-1)
            return k;
        if(C.append(A).indexOf(B)!=-1)
            return k+1;
        return -1;
    }
    
}
