/* Example Input
Input 1:

 A = "((a+b))"
Input 2:

 A = "(a+(a+b))"


Example Output
Output 1:

 1
Output 2:

 0 */

 public class Solution {
    public int solve(int A, int B, int[] C) {
    Stack<Integer> stack = new Stack<Integer>(); 
    // handle b at the end
    for(int a: C){
        if(a!=0){
            stack.push(a);
        }else{
            stack.pop();
        }
    }
    if(stack.isEmpty()) return B;
    return stack.peek();
        
    }
}