public class Solution {
    public int cntBits(int[] A) {
        long ans = 0;
      for(int i=0 ; i<32 ; i++){
          long countSetBit = 0;
          for(int j=0 ; j<A.length ; j++){
               if((A[j] & (1<<i))==0){
                   countSetBit++;
               }
          }
          ans += (2* countSetBit * (A.length - countSetBit))%1000000007;
          ans %= 1000000007;
      }
      return (int)ans;
    }
}
