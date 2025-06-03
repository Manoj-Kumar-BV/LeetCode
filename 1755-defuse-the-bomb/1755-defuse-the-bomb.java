class Solution {
    public int[] decrypt(int[] code, int k) {
     int[] result = new int[code.length];
     if(k > 0){
        for(int i=0; i<code.length; i++){
            int sum = 0;
            for(int j=1; j<=k; j++){
                int id = (i+j)%code.length;
                sum += code[id];
            }
            result[i] = sum;
        }
     }else if(k < 0){
        for(int i=code.length-1; i>=0; i--){
            int sum = 0;
            for(int j=1; j<=-k; j++){
                int id = (i - j + code.length) % code.length;
                sum += code[id];
            }
            result[i] = sum;
        }
     }else if(k == 0){
        for(int i=0; i<code.length; i++){
            result[i] = 0;
        }
     }
     return result;
    }
}