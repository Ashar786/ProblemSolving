/* 
Example Input
Input 1:

A = [
            [1, 5]
            [1, 7]
            [1, 5]
            [1, 7]
            [1, 4]
            [1, 5]
            [2, 0]
            [2, 0]
            [2, 0]
            [2, 0]  ]
Input 2:

 A =  [   
        [1, 5]
        [2 0]
        [1 4]   ]


Example Output
Output 1:

 [-1, -1, -1, -1, -1, -1, 5, 7, 5, 4]
Output 2:

 [-1, 5, -1] */

public class Solution {
    public int[] solve(int[][] A) {
        int size = A.length ;
        int[] ans = new int[size];
        ArrayList<Stack<Integer>> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int a= 0;
        for(int i=0 ; i<size ; i++){
            if(A[i][0]==1){
                hm.put(A[i][1],hm.getOrDefault(A[i][1],0)+1);
                int frequency = hm.get(A[i][1]);
                if(al.size() < frequency){    
                    Stack<Integer> st = new Stack<>();
                    al.add(st);
                }
                al.get(frequency-1).push(A[i][1]);
                ans[a++] = -1;
            }else{
                if(al.get(al.size()-1).size()==0){
                    al.remove(al.size()-1);
                }
                int k = al.get(al.size()-1).pop();
                ans[a++] = k;
                hm.put(k,hm.get(k)-1);
            }
        }
        return ans ;
        
    }
}