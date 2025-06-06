class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while(temp>0){
            int rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp /= 10;
        }
        if(x == reverse){
            return true;
        }      
        else{
            return false;
        }
    }
}