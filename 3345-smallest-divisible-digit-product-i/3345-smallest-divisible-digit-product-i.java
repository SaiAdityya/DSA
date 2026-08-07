class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int mul = product(n);
            if(mul % t == 0){
                return n;
            }
            else{
                n++;
            }
        }

    }
        
        
    public int product(int n){
        int mul = 1;
        while(n > 0){
            int temp = n % 10;
            mul *= temp;
            n /= 10;
        }
        return mul;
    }
}