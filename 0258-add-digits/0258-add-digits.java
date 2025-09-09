class Solution {
    public int addDigits(int num) {
        int result = add(num);
        return result;
    }
    private static int add(int n){
        int res = 0;
        if(n < 10){return n;}
        while(n > 0){
            res += n%10;
            n /= 10;
        }
        return add(res);
    }
}