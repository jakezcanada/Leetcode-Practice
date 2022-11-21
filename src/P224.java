import java.util.Stack;

public class P224 {
    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        int sum = 0;
        int sign = 1;
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int num = 0;
                for(int j = i; j < s.length(); j++){
                    char d = s.charAt(j);
                    if(Character.isDigit(d)){
                        num = num * 10 + (d - '0');
                        i = j;
                    }else{
                        break;
                    }
                }
                sum += sign * num;
                sign = 1;
            }
            if(c == '('){
                st.push(sum);
                st.push(sign);
                sum = 0;
                sign = 1;
            }else if(c == ')'){
                sum *= st.pop();
                sum += st.pop();
            }else if(c == '-'){
                sign *= -1;
            }
        }
        return sum;
    }
}
