class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0; i<32; i++){
            int ld = n & 1;
            res = (res << 1) | ld;
            n = n>>1;
        }
        return res;
    }
}