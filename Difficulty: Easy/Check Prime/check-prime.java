class Solution {
    public static boolean prime(int n) {
        // Write your code here
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime
        
        for (int i = 3; i * i <= n; i += 2) { // check only odd divisors
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}