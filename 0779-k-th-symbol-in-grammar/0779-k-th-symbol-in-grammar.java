class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1){
            return 0;
        }
        int symbol = 1;
        
        for(int currRow = n; currRow > 1; --currRow){
            int totalElements = (int)Math.pow(2, (currRow - 1));
            int halfElements = totalElements / 2;
            
            if(k >halfElements){
                symbol = 1 - symbol;
                k -= halfElements;
            }
        }
            if(symbol != 0){
                return 0;
            }
            return 1;
        
    }
}