import java.util.Arrays;
import java.util.Stack;

public class P1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char l : s.toCharArray()){
            if(!st.isEmpty()) {
                if (l == st.peek()) {
                    st.pop();
                }else{
                    st.push(l);
                }
            }else{
                st.push(l);
            }
        }
        return Arrays.toString(st.toArray()).replaceAll("[ ,\\[\\]]", "");
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("sassddffadsfasdfasdfasdfasdfdb"));
    }
}
