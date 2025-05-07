class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
                flag = true;
            }else if(s.charAt(i) == ' ' && flag == true){
                break;
            }
        }
        return count;
    }
}