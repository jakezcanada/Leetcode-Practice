import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P451 {
    public String frequencySort(String s) {
        List<String> arr = new ArrayList<String>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        for(char c : alphabet){
            arr.add(s.replaceAll("[^" + c + "]", ""));
        }
        Collections.sort(arr, Comparator.comparing(String::length));
        Collections.reverse(arr);
        return String.join("", arr);
    }
}
