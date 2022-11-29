import java.util.Stack;

public class P20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(st.isEmpty()){
                if(c == '(' || c == '[' || c == '{'){
                    st.push(c);
                }else{
                    return false;
                }
            }else{
                if(c == '(' || c == '[' || c == '{'){
                    st.push(c);
                }else if(c == ')' && st.pop() != '('){
                    return false;
                }else if(c == ']' && st.pop() != '['){
                    return false;
                }else if(c == '}' && st.pop() != '{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
