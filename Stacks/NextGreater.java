public class Solution {
    public int[] nextGreater(int[] A) {
        int[] arr = new int[A.length];
        int i=A.length-1 ;
        Stack<Integer> st = new Stack<>();
        while(i>=0){
            if(st.isEmpty()){
                st.push(i);
                arr[i] = -1;
                i--;
            }else{
                if(A[st.peek()]>A[i]){
                    arr[i] = A[st.peek()];
                    st.push(i);
                    i--;
                }else{
                    st.pop();
                }
            }
            
        }
        return arr;
    }
}
/*
Example Input
Input 1:

 A = [4, 5, 2, 10] 
Input 2:

 A = [3, 2, 1] 


Example Output
Output 1:

 [5, 10, 10, -1] 
Output 2:

 [-1, -1, -1] 
 */