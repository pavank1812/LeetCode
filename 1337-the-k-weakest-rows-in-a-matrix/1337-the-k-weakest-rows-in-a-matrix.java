class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int [] ans= new int[k];
        int[][] soliders = new int[mat.length][2];
        
        for(int i=0;i<mat.length;++i){
            soliders[i][0] = IntStream.of(mat[i]).sum();
            soliders[i][1] = i;
            
        }
        Arrays.sort(soliders, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i=0;i <k; ++i)
            ans[i] = soliders[i][1];
        
        return ans;
 
        
    }
}

