class Solution {
    public String decodeAtIndex(String S , int K) {
         long sz = 0;
        for(char c : S.toCharArray()) {
            if(Character.isDigit(c)) sz *= c - '0';
            else sz++;
        }
        
        for(int i = S.length() - 1; i >= 0; i--) {
            K %= sz;
            
            if(K == 0 && Character.isLetter(S.charAt(i)))
                return Character.toString(S.charAt(i));
            
            if(Character.isDigit(S.charAt(i))) sz /= S.charAt(i) - '0';
            else sz--;
        }
        
        return null;
    }
        
}


