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
    public int braces(String A) {
        char[] arr = A.toCharArray();
        Stack<Character> stack = new Stack<Character>() ;
        int count =0;
        boolean isRedundant = false;
        for(char a : arr){
            if(a!=')'){
                stack.push(a);
                continue;
            }else{
                while(stack.pop()!='('){
                    isRedundant = true;
                    count++;
                    
                }
                if(!isRedundant||count<=1) return 1;
                else {
                    isRedundant = false;
                    count=0;
                }
            }
        }
        //if(countPop==1) return 1;
        return 0;
    }
}