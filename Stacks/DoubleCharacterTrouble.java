//optimised soln
public class Solution {
    public String solve(String A) {
        Stack<Character> st = new Stack<>();
        //char[] arr = A.toCharArray();
        int i=0;
        while(i<A.length()){
            char c = A.charAt(i);
            if(st.isEmpty()){
                st.push(c);
            }else{
                if(st.peek()==c){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
            i++;
        }
        String ans ="";
        char[] arr = new char[st.size()];
        i=st.size()-1;
        while(!st.isEmpty() && i>=0){
            arr[i] = st.pop();
            i--;
        }
        return new String(arr) ;
    }
}


//TLE solution 
public class Solution {
    public String solve(String A) {
        Stack<Character> st = new Stack<>();
        char[] arr = A.toCharArray();
        for(Character c : arr){
            if(st.isEmpty()){
                st.push(c);
            }else{
                if(st.peek()==c){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }
        String ans ="";
        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        return ans ;
    }
}

/* 
Example Input
Input 1:

 A = abccbc
Input 2:

 A = ab


Example Output
Output 1:

 "ac"
Output 2:

 "ab"
 */