class Solution {
    public boolean isPowerOfFour(int n) {
        // for(int i=0; i<100; i++){
        //     if(Math.pow(4,i) == n){
        //         return true;
        //     }
        // }
        // return false;
        if(n > 0){
            if((n & (n-1)) == 0 && (n-1)%3==0){
                return true;
            }
        }
        return false;
    }
}