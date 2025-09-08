class Solution {
    public int countPrimes(int n) {
    //     if (n <= 1){
    //         return 0;
    //     }
    //     int count = 0;
    //     for(int i=2; i<n; i++){
    //         if(isprime(i))  count++;
    //     }
    //     return count;
    // }
    // private boolean isprime(int x){
    //     if(x <= 1){
    //         return false;
    //     }

    //     for(int i=2; i*i <=x; i++){
    //         if(x % i == 0)  return false;
    //     }
    //     return true;
    // }
    if (n <= 2) return 0;

    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);

    isPrime[0] = isPrime[1] = false;

    for (int i = 2; i * i < n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    int count = 0;
    for (boolean prime : isPrime) {
        if (prime) count++;
    }

    return count;
    }
}