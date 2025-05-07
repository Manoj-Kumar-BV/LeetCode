class Solution {
    public int findComplement(int num){
        int numBits = (int)(Math.log(num)/Math.log(2))+1;
        int bitmask = (1 << numBits)-1;
        return num ^ bitmask;
    }
}