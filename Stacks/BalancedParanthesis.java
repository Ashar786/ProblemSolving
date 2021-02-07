public class Solution {
    public int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = A.toCharArray();
        for(char a : arr){
            if(stack.isEmpty()&&( a=='}'||a==']'||a==')')) return 0;
            if(a=='}'){
                if(stack.peek()!='{') return 0;
                stack.pop();
            }else if(a==')'){
                if(stack.peek()!='(') return 0;
                stack.pop();
            }else if(a==']'){
                if(stack.peek()!='[') return 0;
                stack.pop();
            }else{
                stack.push(a);
            }
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
}