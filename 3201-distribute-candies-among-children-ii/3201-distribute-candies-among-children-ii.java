class Solution {
    public long distributeCandies(int n, int limit) {
        long count = 0;
        for (int i = 0; i <= limit; i++) {
            
            int minJ = Math.max(0, n - i - limit); 
            int maxJ = Math.min(limit, n - i);     
            if (minJ <= maxJ) {
                count += (maxJ - minJ + 1); 
            }
        }
        return count;
    }
}
