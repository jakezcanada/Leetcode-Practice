import java.util.Arrays;

public class P899 {
    public String orderlyQueue(String s, int k) {
        //if k = 1, find smallest within s+s because that gives all iterations
        if(k==1){
            String str = s+s;
            String smallest = s;
            for(int i = 0; i<s.length(); i++){
                smallest = smallest.compareTo(str.substring(i,i+s.length())) > 0 ? str.substring(i,i+s.length()) : smallest;
            }
            return smallest;
        }
        // if k = 2, sort the string cos it don't matter lol
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = String.valueOf(arr);
        return sorted;
    }
}
