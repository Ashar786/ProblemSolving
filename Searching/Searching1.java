// Single Element in sorted element 

public class Solution {
    public int binarySearchSESA(int[] A , int start , int end){
        if(start>end) return -1 ;
        if(start==end) return start;
        int mid= (start+end)/2 ;
        
        if(mid%2==0){
            if(A[mid]==A[mid+1]){
                return binarySearchSESA(A,mid+2,end);
            }else{
                return binarySearchSESA(A,start,mid);
            }
        }else{
            if(A[mid]==A[mid-1]){
                return binarySearchSESA(A,mid+1,end);
            }else{
                return binarySearchSESA(A,start,mid-1);
            }
        }
    }
    
    public int solve(int[] A) {
    int ans = binarySearchSESA(A,0,A.length -1);
    return A[ans] ;
        
    }
}
