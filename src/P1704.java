public class P1704 {
    public boolean halvesAreAlike(String s) {
        return s.substring(0, s.length()/2).replaceAll("[aeiouAEIOU]", "").length() == s.substring(s.length()/2, s.length()).replaceAll("[aeiouAEIOU]", "").length();
    }
}
