class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    if(i==j || i==k || j==k){
                        continue;
                    }else{
                        int num = (digits[i] * 100) + (digits[j] * 10) + (digits[k] * 1);

                        if(num >= 100 && num % 2 == 0){
                            result.add(num);
                        }
                    }
                }
            }
        }
        int[] arr = new int[result.size()];
        int i=0; 
        for(int num : result){
            arr[i++] = num;
        }
        Arrays.sort(arr);
        return arr;
    }
}