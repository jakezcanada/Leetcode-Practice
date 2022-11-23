import java.util.HashMap;
import java.util.Map;

public class P279 {
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    public int numSquares(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int least = Integer.MAX_VALUE;
        for(int i = (int) Math.sqrt(n) + 1; i > -1; i--){

        }
        return least;
    }
}
