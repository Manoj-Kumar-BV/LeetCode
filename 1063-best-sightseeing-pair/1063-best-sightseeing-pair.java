class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxscore = 0;
        int maxi = values[0];
        for(int j=1; j<values.length; j++){
            maxscore = Math.max(maxscore, maxi + values[j] - j);
            maxi = Math.max(maxi, values[j] + j);
        }
        return maxscore;
    }
}