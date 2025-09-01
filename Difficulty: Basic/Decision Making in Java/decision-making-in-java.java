// User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        String ans = "";
        if(n<m){
            ans = "lesser";
        }
        if(n > m){
            ans = "greater";
        }
        if(n == m){
            ans = "equal";
        }
        return ans;
    }
}