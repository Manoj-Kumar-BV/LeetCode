class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length + 1];
        altitude[0] = 0;
        int highest = Integer.MIN_VALUE;

        for(int i=0; i<gain.length; i++){
            altitude[i+1] =  altitude[i] + gain[i];
        }
        for(int i=0; i<altitude.length; i++){
            if(highest < altitude[i]){
                highest = altitude[i];
            }
        }
        return highest;
    }
}