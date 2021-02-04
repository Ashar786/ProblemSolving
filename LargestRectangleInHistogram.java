
public class Solution {
    public int largestRectangleArea(int[] A) {
        if(A.length == 1)return A[0];
        int maxArea = Integer.MIN_VALUE; 
        Stack<Integer> st = new Stack<>();
        int i=0 ; 
        for( i=0 ; i<A.length ; i++){
            if(st.isEmpty()){
                st.push(i);
            }else{
                if(A[i]>=A[st.peek()]){
                    st.push(i);
                }else{
                    int a = st.pop(); int p;
                    if(st.isEmpty()){
                        p=i;
                    }else{
                        p=i-st.peek()-1;
                    }
                    maxArea = Math.max(maxArea,p*A[a]);
                    i--;
                }
            }
        }
        while(!st.isEmpty()){
             int a = st.pop(); int p;
                    if(st.isEmpty()){
                        p=i;
                    }else{
                        p=i-st.peek()-1;
                    }
                    maxArea = Math.max(maxArea,p*A[a]);
        }
        return maxArea;
        
    }
}

/*
Example Input
Input 1:

 A = [2, 1, 5, 6, 2, 3]
Input 2:

 A = [2]


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
Explanation 2:

Largest rectangle has area 2.
*/