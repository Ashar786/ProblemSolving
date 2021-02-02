/* Example Input
Input 1:

 A = "-(a+b+c)"
 B = "-a-b-c"
Input 2:

 A = "a-b-(c-d)"
 B = "a-b-c-d"


Example Output
Output 1:

 1
Output 2:

 0 */
public class Solution {
    
    public boolean adjacent(String s , int i){
        if(i==0) return true;
        if(s.charAt(i-1)=='-') return false;
        return true;
    }
    
    public boolean[] eval(String A){
        boolean[] arr = new boolean[26];
        Stack<Boolean> st = new Stack<>();
        st.push(true);
        
        for(int i=0 ; i<A.length() ; i++){
            if(A.charAt(i)=='+' || A.charAt(i)=='-'){
            continue;
        }
        if(A.charAt(i)=='('){
            st.push(adjacent(A,i));
        }else if(A.charAt(i)==')'){
            st.pop();
        }else {
            arr[A.charAt(i)-'a'] = (st.peek() == adjacent(A,i));
        }
        }
        return arr ;
    }
    
    public int solve(String A, String B) {
        boolean[] arrA = new boolean[26];
        boolean[] arrB = new boolean[26];
        
        arrA = eval(A);
        arrB = eval(B);
        
        for(int i=0 ; i<26 ; i++){
            if(arrA[i]!=arrB[i]) return 0;
        }
        return 1;
    }
}
