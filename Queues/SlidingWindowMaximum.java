public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {
        int[] bc = {1};
        if(B>A.length) return bc;
        
        
        LinkedList<Integer> ll = new LinkedList<>();
        int[] arr = new int[A.length-B+1] ;
        for(int i=0 ; i<A.length ; i++){
            while(!ll.isEmpty() && A[ll.getLast()]<=A[i]){
                
                    ll.removeLast(); 
            }
            ll.add(i);
            if(i>=B-1){
                arr[i-B+1] = A[ll.getFirst()];
            }
            
            if(ll.getFirst()==i-B+1) ll.removeFirst();
        }
        return arr;
    }
}


/* 
Example Input
Input 1:

 A = [1, 3, -1, -3, 5, 3, 6, 7]
 B = 3
Input 2:

 A = [1, 2, 3, 4, 2, 7, 1, 3, 6]
 B = 6


Example Output
Output 1:

 [3, 3, 5, 5, 6, 7]
Output 2:

 [7, 7, 7, 7]


Example Explanation
Explanation 1:

 Window position     | Max
 --------------------|-------
 [1 3 -1] -3 5 3 6 7 | 3
 1 [3 -1 -3] 5 3 6 7 | 3
 1 3 [-1 -3 5] 3 6 7 | 5
 1 3 -1 [-3 5 3] 6 7 | 5
 1 3 -1 -3 [5 3 6] 7 | 6
 1 3 -1 -3 5 [3 6 7] | 7
Explanation 2:

 Window position     | Max
 --------------------|-------
 [1 2 3 4 2 7] 1 3 6 | 7
 1 [2 3 4 2 7 1] 3 6 | 7
 1 2 [3 4 2 7 1 3] 6 | 7
 1 2 3 [4 2 7 1 3 6] | 7 */