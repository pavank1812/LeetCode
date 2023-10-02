class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            int a=0,b=1;
            for(int i=2;i<=n;i++){
                int temp = a+b;
                a=b;
                b=temp;
            }
            return b;
        }
    }
}
