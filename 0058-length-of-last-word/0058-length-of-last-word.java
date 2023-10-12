class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int n = s.length();
        for(int i = n - 1;i>=0; i--){
            char c = s.charAt(i);
            if(c != ' '){
               length++;
            }
            else if(length >0){
                break;
            }
        }
        return length;
    }
}

