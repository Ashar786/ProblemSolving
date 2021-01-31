/* Example Input
Input 1:

 A = [5, 4, 3, 2, 1]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 [1, 2, 3, 4, 5]
Output 2:

 [5, 11, 17, 100] */


public class Solution {
    public int[] solve(int[] A) {
    Stack<Integer> stack = new Stack<Integer>() ;
    Stack<Integer> helperStack = new Stack<Integer>() ;
        
    for(int a: A){
        while(!stack.isEmpty()&& a>stack.peek()){
            helperStack.push(stack.pop());
        }
        stack.push(a);
        while(!helperStack.isEmpty()){
            stack.push(helperStack.pop());
        }
    }
    int[] arr = new int[stack.size()];
    for(int i=0 ; i<arr.length ; i++){
        arr[i]=stack.pop();
    }
    return arr ;
    }
}