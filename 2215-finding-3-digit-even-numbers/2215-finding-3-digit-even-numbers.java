class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int freq[] = new int[10];
        for(int i=0; i<digits.length; i++){
            freq[digits[i]]++;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=9; i++){
            if(freq[i] == 0){
                continue;
            }
            freq[i]--;
            for(int j=0; j<=9; j++){
                if(freq[j] == 0){
                    continue;
                }
                freq[j]--;
                for(int k=0; k<=8; k+=2){
                    if(freq[k] == 0){
                        continue;
                    }
                    freq[k]--;
                    int num = (i*100) + (j*10) + (k);
                    set.add(num);
                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++;
        }
        int result[] = new int[set.size()];
        int i=0;
        for(int num : set){
            result[i++] = num;
        }
        Arrays.sort(result);
        return result;
    }
}