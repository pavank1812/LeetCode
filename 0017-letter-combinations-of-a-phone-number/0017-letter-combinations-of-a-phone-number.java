class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> result = new ArrayList<>(); 
         if (digits == null || digits.isEmpty())
         {
             return result;
         }
        String[] mapping = {"abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        result.add("");
        
        
        for (char digit : digits.toCharArray()) {
            String letters = mapping[digit - '2'];
            int size = result.size();

            while (size-- > 0) {
                String current = result.remove(0);
                for (char letter : letters.toCharArray()) {
                    result.add(current + letter);
                }
            }
        }

        return result;
    }
}

