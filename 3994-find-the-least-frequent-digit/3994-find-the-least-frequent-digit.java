class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] count = new int[10];
        while(n > 0){
            int digit = n%10;
            count[digit]++;
            n /=10;
        }
        int min = Integer.MAX_VALUE;
        int d = -1;

        for(int i=0; i<10; i++){
            if(count[i] > 0){
                if(count[i] < min){
                    min = count[i];
                    d = i;
                }else if(count[i] == min && i < d){
                    d = i;
                }
            }
        }
        return d;
    }
}