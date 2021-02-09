public class Solution {
    public String solve(String A) {
    String vowel = "";
    char[] arr = A.toCharArray();
    for(char a : arr){
        if(a=='U'||a=='O'||a=='I'||a=='E'||a=='A'||a=='u'||a=='o'||a=='i'||a=='e'||a=='a'){
            vowel += a;
        }
    }
    return vowel;
        
    }
}
//check vowel