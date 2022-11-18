public class P263 {
    public boolean isUgly(int n) {
        if(n == 0){
            return false;
        }
        for(int i = 5; i >= 2; i--){
            // 4 is just 2^2, don't care
            while(n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }
}
