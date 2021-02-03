class Solution {
   Stack<Integer> stack = new Stack<Integer>();
   int min =Integer.MAX_VALUE;
  void push(int x) 

    { 

       

        if (stack.empty()) 

        { 

            min = x; 

            stack.push(x); 

         

            return; 

        } 

  

      

        if (x < min) 

        { 

            stack.push(2*x - min); 

            min = x; 

        } 

  

        else

           stack.push(x); 

  

       

    }
  
    // public void push(int x) {
        
    //     if(stack.isEmpty()){
    //       min = x;
    //       stack.push(x);
    //     }else{
    //         if(x>min){
    //         stack.push(x);
    //     }else{
    //       int a = min-x  ;
    //       stack.push(a);
    //       min =x;
    //     }
    //     }
    // }

void pop() 

    { 

        if (stack.empty()) 

        { 

           

            return; 

        } 

  

       

        int t = stack.peek(); 

        stack.pop(); 

  

        if (t < min) 

        { 

            

            min = 2*min - t; 

        } 

  

   

    } 

  

    // public void pop() {
    
    //     if(!stack.isEmpty()){
    //         if(stack.peek()<min){
    //         min = stack.peek()+min;
    //     }
    //         stack.pop();
        
    //     }
    // }

    public int top() {
        if(!stack.isEmpty()){
            if(stack.peek()<min){
            return min;
            }else{
            return stack.peek();
            }
        }
        return -1;
    }

    public int getMin() {
        if(stack.isEmpty()) return -1;
        return min ;
    }
    
}
