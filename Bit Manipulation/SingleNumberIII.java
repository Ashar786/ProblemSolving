public class Solution {
    public int[] solve(int[] A) {
        int xor = 0 ;
        
        for(int a : A){
            xor ^= a;
        }
        int[] arr = new int[2];
        int setBit=0;
        for(int i=0 ; i<32 ; i++){
           if((xor>>i & 1) == 1) {setBit = i;
            break;}
        }
        int xora = 0 ; 
        int xorb = 0 ;
        for(int a: A){
            if(((a>>setBit) &1 )==1){
                xora ^= a;
                
            }else{
                xorb ^= a;
            }
        }
        arr[0] = Math.min(xora,xorb);
        arr[1] = Math.max(xora,xorb);
        
        return arr ;
    }
}