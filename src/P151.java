import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P151 {
    public static String reverseWords(String s) {
        List<String> strings = new ArrayList<String>(Arrays.asList(s.trim().split("\\p{Zs}+")));
        Collections.reverse(strings);
        return String.join(" ", strings);
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("FUCK    FUCKKKK"));
    }
}