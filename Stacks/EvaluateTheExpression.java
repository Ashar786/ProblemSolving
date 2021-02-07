public class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    public int evalRPN(String[] A) {
    for(String a : A){
        if(stack.isEmpty()){
            stack.push(Integer.parseInt(a));
        }else{
            if(a.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(a.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(a.equals("-")){
                int i = stack.pop();
                int j = stack.pop();
                    stack.push(j-i);
            }else if (a.equals("/")){
                int i = stack.pop();
                int j = stack.pop();
                    stack.push(j/i);
            }else{
                stack.push(Integer.parseInt(a));
            }
        }
    }
        return stack.peek();
    }
}


/* Example Input
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]


Example Output
Output 1:
    9
Output 2:
    6


Example Explanation
Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9
Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    1 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6 */