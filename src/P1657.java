import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1657 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        if(word1.replaceAll("[" + word2 + "]", "").length() != 0) return false;
        List<Integer> list1 = new ArrayList<Integer>(Collections.nCopies(26, 0));
        List<Integer> list2 = new ArrayList<Integer>(Collections.nCopies(26, 0));
        for(int i = 0; i < word1.length(); i++){
            char a = word1.charAt(i);
            char b = word2.charAt(i);
            list1.set(a - 97, list1.get(a - 97) + 1);
            list2.set(b - 97, list2.get(b - 97) + 1);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}
