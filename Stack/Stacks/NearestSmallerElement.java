public class Solution {
    public int[] prevSmaller(int[] A) {
        int[] arr = new int[A.length];
        int i=0 ;
        Stack<Integer> st = new Stack<>();
        while(i<A.length){
            if(st.isEmpty()){
                st.push(i);
                arr[i] = -1;
                i++;
            }else{
                if(A[st.peek()]<A[i]){
                    arr[i] = A[st.peek()];
                    st.push(i);
                    i++;
                }else{
                    st.pop();
                }
            }
            
        }
        return arr;
    }
}
/* Example Input
Input 1:

 A = [4, 5, 2, 10, 8]
Input 2:

 A = [3, 2, 1]


Example Output
Output 1:

[-1, 4, -1, 2, 2]
Output 2:

 [-1, -1, -1] */